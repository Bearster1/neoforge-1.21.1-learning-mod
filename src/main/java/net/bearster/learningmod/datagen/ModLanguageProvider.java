package net.bearster.learningmod.datagen;

import net.bearster.learningmod.LearningMod;
import net.bearster.learningmod.block.ModBlocks;
import net.bearster.learningmod.item.ModCreativeModTabs;
import net.bearster.learningmod.item.ModItems;
import net.bearster.learningmod.trim.ModTrimPatterns;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimPattern;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.LanguageProvider;

import java.util.Arrays;

public class ModLanguageProvider extends LanguageProvider {
    public ModLanguageProvider(PackOutput output) {
        super(output, LearningMod.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        basicTranslation(ModItems.BLACK_OPAL.get());
        basicTranslation(ModItems.RAW_BLACK_OPAL.get());

        basicTranslation(ModItems.CHAINSAW.get());

        basicTranslation(ModItems.TOMATO.get());

        basicTranslation(ModItems.FROSTFIRE_ICE.get());

        basicTranslation(ModItems.BLACK_OPAL_SWORD.get());
        basicTranslation(ModItems.BLACK_OPAL_PICKAXE.get());
        basicTranslation(ModItems.BLACK_OPAL_SHOVEL.get());
        basicTranslation(ModItems.BLACK_OPAL_AXE.get());
        basicTranslation(ModItems.BLACK_OPAL_HOE.get());

        basicTranslation(ModItems.BLACK_OPAL_PAXEL.get());
        basicTranslation(ModItems.BLACK_OPAL_HAMMER.get());

        basicTranslation(ModItems.BLACK_OPAL_HELMET.get());
        basicTranslation(ModItems.BLACK_OPAL_CHESTPLATE.get());
        basicTranslation(ModItems.BLACK_OPAL_LEGGINGS.get());
        basicTranslation(ModItems.BLACK_OPAL_BOOTS.get());
        basicTranslation(ModItems.BLACK_OPAL_HORSE_ARMOR.get());

        basicTranslation(ModItems.DATA_TABLET.get());
        basicTranslation(ModItems.METAL_DETECTOR.get());

        basicTranslation(ModItems.DIAMOND_BOW.get());

        basicTranslation(ModBlocks.BLACK_OPAL_BLOCK.get());
        basicTranslation(ModBlocks.RAW_BLACK_OPAL_BLOCK.get());

        basicTranslation(ModBlocks.BLACK_OPAL_ORE.get());
        basicTranslation(ModBlocks.BLACK_OPAL_DEEPSLATE_ORE.get());
        basicTranslation(ModBlocks.BLACK_OPAL_END_ORE.get());
        basicTranslation(ModBlocks.BLACK_OPAL_NETHER_ORE.get());

        basicTranslation(ModBlocks.MAGIC_BLOCK.get());

        basicTranslation(ModBlocks.BLACK_OPAL_STAIRS.get());
        basicTranslation(ModBlocks.BLACK_OPAL_SLAB.get());
        basicTranslation(ModBlocks.BLACK_OPAL_PRESSURE_PLATE.get());
        basicTranslation(ModBlocks.BLACK_OPAL_BUTTON.get());
        basicTranslation(ModBlocks.BLACK_OPAL_FENCE.get());
        basicTranslation(ModBlocks.BLACK_OPAL_FENCE_GATE.get());
        basicTranslation(ModBlocks.BLACK_OPAL_WALL.get());
        basicTranslation(ModBlocks.BLACK_OPAL_DOOR.get());
        basicTranslation(ModBlocks.BLACK_OPAL_TRAPDOOR.get());

        basicTranslation(ModBlocks.BLACK_OPAL_LAMP.get());

        add(ModItems.KAUPEN_SMITHING_TEMPLATE.get(), "Kaupen Trim Template");

        addCreativeTabType(ModCreativeModTabs.BLACK_OPAL_ITEMS_TAB.get(), "Black Opal Items");
        addCreativeTabType(ModCreativeModTabs.BLACK_OPAL_BLOCKS_TAB.get(), "Black Opal Blocks");

        addTooltipType("chainsaw.tooltip.shift","Press §eShift§r for more Information!");
        addTooltipType("chainsaw.tooltip.1","This chainsaw is awesome and will cut down trees!");
        addTooltipType("chainsaw.tooltip.2","§oChainsaw go vroom!§r");
        addTooltipType("magic_block.tooltip.1","This Block is §9MAGICAL§r");
        addTooltipType("tomato.1","Tomato; Tomato");
        addTrimPatternType("kaupen","Kaupen Armor Trim");
        addTrimMaterialType("black_opal","Black Opal Material");
        addMessageType("metal_detector.no_valuables","No Valuables Found!");

    }

    public void basicTranslation(Item item) {
        String name = item.getDescriptionId().replace('_',' ');
        String[] names = name.split("\\.");
        name = names[2];
        String[] parts = name.split("\\s");
        for (int i = 0; i < parts.length; i++) {
            parts[i] = parts[i].substring(0, 1).toUpperCase() + parts[i].substring(1);
        }
        name = "";
        for (int i = 0; i < parts.length; i++) {
            if (i < parts.length - 1) {
                name = name + parts[i] + " ";
            } else {
                name = name + parts[i];
            }
        }

        add(item, name);
    }

    public void basicTranslation(Block block) {
        String name = block.getDescriptionId().replace('_',' ');
        String[] names = name.split("\\.");
        name = names[2];
        String[] parts = name.split("\\s");
        for (int i = 0; i < parts.length; i++) {
            parts[i] = parts[i].substring(0, 1).toUpperCase() + parts[i].substring(1);
        }
        name = "";
        for (int i = 0; i < parts.length; i++) {
            if (i < parts.length - 1) {
                name = name + parts[i] + " ";
            } else {
                name = name + parts[i];
            }
        }

        add(block, name);
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

    public void addTrimPatternType(String keyName, String translatedName) {
        add("trim_pattern."+LearningMod.MOD_ID+"."+keyName, translatedName);
    }

    public void addTrimMaterialType(String keyName, String translatedName) {
        add("trim_material."+LearningMod.MOD_ID+"."+keyName, translatedName);
    }

    public void addMessageType(String keyName, String translatedName) {
        add("message."+LearningMod.MOD_ID+"."+keyName, translatedName);
    }
}
