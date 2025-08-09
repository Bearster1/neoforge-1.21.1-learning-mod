package net.bearster.learningmod.datagen;

import net.bearster.learningmod.LearningMod;
import net.bearster.learningmod.block.ModBlocks;
import net.bearster.learningmod.item.ModCreativeModTabs;
import net.bearster.learningmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class ModLanguageProvider extends LanguageProvider {
    public ModLanguageProvider(PackOutput output) {
        super(output, LearningMod.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add(ModItems.BLACK_OPAL.get(), "Black Opal");
        add(ModItems.RAW_BLACK_OPAL.get(), "Raw Black Opal");

        add(ModItems.CHAINSAW.get(), "Chainsaw");

        add(ModItems.TOMATO.get(), "Tomato");

        add(ModItems.FROSTFIRE_ICE.get(), "Frostfire Ice");

        add(ModBlocks.BLACK_OPAL_BLOCK.get(), "Black Opal Block");
        add(ModBlocks.RAW_BLACK_OPAL_BLOCK.get(), "Raw Black Opal Block");

        add(ModBlocks.BLACK_OPAL_ORE.get(), "Black Opal Ore");
        add(ModBlocks.BLACK_OPAL_DEEPSLATE_ORE.get(), "Black Opal Deepslate Ore");
        add(ModBlocks.BLACK_OPAL_END_ORE.get(), "Black Opal End Ore");
        add(ModBlocks.BLACK_OPAL_NETHER_ORE.get(), "Black Opal Nether Ore");

        add(ModBlocks.MAGIC_BLOCK.get(), "Magic Block");

        add(ModBlocks.BLACK_OPAL_STAIRS.get(),"Black Opal Stairs");
        add(ModBlocks.BLACK_OPAL_SLAB.get(), "Black Opal Slab");
        add(ModBlocks.BLACK_OPAL_PRESSURE_PLATE.get(),"Black Opal Pressure Plate");
        add(ModBlocks.BLACK_OPAL_BUTTON.get(), "Black Opal Button");
        add(ModBlocks.BLACK_OPAL_FENCE.get(), "Black Opal Fence");
        add(ModBlocks.BLACK_OPAL_FENCE_GATE.get(),"Black Opal Fence Gate");
        add(ModBlocks.BLACK_OPAL_WALL.get(), "Black Opal Wall");
        add(ModBlocks.BLACK_OPAL_DOOR.get(),"Black Opal Door");
        add(ModBlocks.BLACK_OPAL_TRAPDOOR.get(), "Black Opal Trapdoor");

        addCreativeTabType(ModCreativeModTabs.BLACK_OPAL_ITEMS_TAB.get(), "Black Opal Items");
        addCreativeTabType(ModCreativeModTabs.BLACK_OPAL_BLOCKS_TAB.get(), "Black Opal Blocks");

        addTooltipType("chainsaw.tooltip.shift","Press §eShift§r for more Information!");
        addTooltipType("chainsaw.tooltip.1","This chainsaw is awesome and will cut down trees!");
        addTooltipType("chainsaw.tooltip.2","§oChainsaw go vroom!§r");
        addTooltipType("magic_block.tooltip.1","This Block is §9MAGICAL§r");
        addTooltipType("tomato.1","Tomato; Tomato");

    }

    public void addCreativeTabType(CreativeModeTab creativeModeTab, String name) {
        add(creativeModeTab.getDisplayName().getString(), name);
    }

    public void addMusicDiscType(SoundEvent songIdentifier, String songName, String description) {
        String song = songIdentifier.getLocation().toString();
        String newSong = song.replace(':','.');
        add("item."+newSong+"_music_disc", songName+" Music Disc");
        add("jukebox_song."+newSong, description);

    }

    public void addSoundType(SoundEvent soundIdentifier, String soundName) {
        String sound = soundIdentifier.getLocation().toString();
        String newSound = sound.replace(':','.');
        add("sounds."+newSound, soundName);

    }

    public void addPaintingType(ResourceKey paintingVariants, String paintingName, String paintingAuthor) {
        String painting = paintingVariants.location().toString();
        String newPainting = painting.replace(':','.');
        add("painting."+newPainting+".title", paintingName);
        add("painting."+newPainting+".author", paintingAuthor);

    }

    public void addNameType(String keyName, String translatedName) {
        add("name."+LearningMod.MOD_ID+"."+keyName, translatedName);
    }

    public void addAdvancementType(String keyName,
                                   String translatedTitle,
                                   String translatedDescription) {
        add("advancements."+LearningMod.MOD_ID+"."+keyName+".title", translatedTitle);
        add("advancements."+LearningMod.MOD_ID+"."+keyName+".description", translatedDescription);
    }

    public void addTooltipType(String keyName, String translatedName) {
        add("tooltip."+LearningMod.MOD_ID+"."+keyName, translatedName);
    }
}
