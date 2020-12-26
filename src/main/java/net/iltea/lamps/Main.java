package net.iltea.lamps;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;

import net.minecraft.block.Block;
import net.minecraft.block.Material;

import net.minecraft.item.*;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import net.iltea.lamps.block.Lamp;
import net.iltea.lamps.block.TallLamp;

public class Main implements ModInitializer {

	// Значения для ламп: Свет, крепкость и взрывоустойчивость.
	private static float hardressLamp = 4.0f;
	private static float resistanceLamp = 0.2f;
	private static int lightLevelLamp = 15;

	// Идентификатор пропа.
	private static String itemBy = "lamps";

	// Предметы.
	public static final Item LampCover = new Item(new Item.Settings().maxCount(16));
	public static final Item IronRod = new Item(new Item.Settings().maxCount(64));
	public static final Item Lightbulb = new Item(new Item.Settings().maxCount(16));
	public static final Item BrokenLightbulb = new Item(new Item.Settings().maxCount(16));

	// Короткие лампы в 1 блок.
	public static final Block WhiteLamp = new Lamp(FabricBlockSettings.of(Material.METAL).hardness(hardressLamp).resistance(resistanceLamp).lightLevel(lightLevelLamp).breakByTool(FabricToolTags.PICKAXES).luminance(lightLevelLamp));
	public static final Block RedLamp = new Lamp(FabricBlockSettings.of(Material.METAL).hardness(hardressLamp).resistance(resistanceLamp).lightLevel(lightLevelLamp).breakByTool(FabricToolTags.PICKAXES).luminance(lightLevelLamp));
	public static final Block OrangeLamp = new Lamp(FabricBlockSettings.of(Material.METAL).hardness(hardressLamp).resistance(resistanceLamp).lightLevel(lightLevelLamp).breakByTool(FabricToolTags.PICKAXES).luminance(lightLevelLamp));
	public static final Block YellowLamp = new Lamp(FabricBlockSettings.of(Material.METAL).hardness(hardressLamp).resistance(resistanceLamp).lightLevel(lightLevelLamp).breakByTool(FabricToolTags.PICKAXES).luminance(lightLevelLamp));
	public static final Block GreenLamp = new Lamp(FabricBlockSettings.of(Material.METAL).hardness(hardressLamp).resistance(resistanceLamp).lightLevel(lightLevelLamp).breakByTool(FabricToolTags.PICKAXES).luminance(lightLevelLamp));
	public static final Block BlueLamp = new Lamp(FabricBlockSettings.of(Material.METAL).hardness(hardressLamp).resistance(resistanceLamp).lightLevel(lightLevelLamp).breakByTool(FabricToolTags.PICKAXES).luminance(lightLevelLamp));
	public static final Block LightBlueLamp = new Lamp(FabricBlockSettings.of(Material.METAL).hardness(hardressLamp).resistance(resistanceLamp).lightLevel(lightLevelLamp).breakByTool(FabricToolTags.PICKAXES).luminance(lightLevelLamp));
	public static final Block PinkLamp = new Lamp(FabricBlockSettings.of(Material.METAL).hardness(hardressLamp).resistance(resistanceLamp).lightLevel(lightLevelLamp).breakByTool(FabricToolTags.PICKAXES).luminance(lightLevelLamp));
	public static final Block LightGrayLamp = new Lamp(FabricBlockSettings.of(Material.METAL).hardness(hardressLamp).resistance(resistanceLamp).lightLevel(lightLevelLamp).breakByTool(FabricToolTags.PICKAXES).luminance(lightLevelLamp));
	public static final Block BlackLamp = new Lamp(FabricBlockSettings.of(Material.METAL).hardness(hardressLamp).resistance(resistanceLamp).lightLevel(lightLevelLamp).breakByTool(FabricToolTags.PICKAXES).luminance(lightLevelLamp));
	public static final Block BrownLamp = new Lamp(FabricBlockSettings.of(Material.METAL).hardness(hardressLamp).resistance(resistanceLamp).lightLevel(lightLevelLamp).breakByTool(FabricToolTags.PICKAXES).luminance(lightLevelLamp));
	public static final Block LimeLamp = new Lamp(FabricBlockSettings.of(Material.METAL).hardness(hardressLamp).resistance(resistanceLamp).lightLevel(lightLevelLamp).breakByTool(FabricToolTags.PICKAXES).luminance(lightLevelLamp));

	// Высокие лампы в 2 блока.
	public static final Block TallWhiteLamp = new TallLamp(FabricBlockSettings.of(Material.METAL).hardness(hardressLamp).resistance(resistanceLamp).lightLevel(lightLevelLamp).breakByTool(FabricToolTags.PICKAXES).luminance(lightLevelLamp));
	public static final Block TallRedLamp = new TallLamp(FabricBlockSettings.of(Material.METAL).hardness(hardressLamp).resistance(resistanceLamp).lightLevel(lightLevelLamp).breakByTool(FabricToolTags.PICKAXES).luminance(lightLevelLamp));
	public static final Block TallOrangeLamp = new TallLamp(FabricBlockSettings.of(Material.METAL).hardness(hardressLamp).resistance(resistanceLamp).lightLevel(lightLevelLamp).breakByTool(FabricToolTags.PICKAXES).luminance(lightLevelLamp));
	public static final Block TallYellowLamp = new TallLamp(FabricBlockSettings.of(Material.METAL).hardness(hardressLamp).resistance(resistanceLamp).lightLevel(lightLevelLamp).breakByTool(FabricToolTags.PICKAXES).luminance(lightLevelLamp));
	public static final Block TallGreenLamp = new TallLamp(FabricBlockSettings.of(Material.METAL).hardness(hardressLamp).resistance(resistanceLamp).lightLevel(lightLevelLamp).breakByTool(FabricToolTags.PICKAXES).luminance(lightLevelLamp));
	public static final Block TallBlueLamp = new TallLamp(FabricBlockSettings.of(Material.METAL).hardness(hardressLamp).resistance(resistanceLamp).lightLevel(lightLevelLamp).breakByTool(FabricToolTags.PICKAXES).luminance(lightLevelLamp));
	public static final Block TallLightBlueLamp = new TallLamp(FabricBlockSettings.of(Material.METAL).hardness(hardressLamp).resistance(resistanceLamp).lightLevel(lightLevelLamp).breakByTool(FabricToolTags.PICKAXES).luminance(lightLevelLamp));
	public static final Block TallPinkLamp = new TallLamp(FabricBlockSettings.of(Material.METAL).hardness(hardressLamp).resistance(resistanceLamp).lightLevel(lightLevelLamp).breakByTool(FabricToolTags.PICKAXES).luminance(lightLevelLamp));
	public static final Block TallLightGrayLamp = new TallLamp(FabricBlockSettings.of(Material.METAL).hardness(hardressLamp).resistance(resistanceLamp).lightLevel(lightLevelLamp).breakByTool(FabricToolTags.PICKAXES).luminance(lightLevelLamp));
	public static final Block TallBlackLamp = new TallLamp(FabricBlockSettings.of(Material.METAL).hardness(hardressLamp).resistance(resistanceLamp).lightLevel(lightLevelLamp).breakByTool(FabricToolTags.PICKAXES).luminance(lightLevelLamp));
	public static final Block TallBrownLamp = new TallLamp(FabricBlockSettings.of(Material.METAL).hardness(hardressLamp).resistance(resistanceLamp).lightLevel(lightLevelLamp).breakByTool(FabricToolTags.PICKAXES).luminance(lightLevelLamp));
	public static final Block TallLimeLamp = new TallLamp(FabricBlockSettings.of(Material.METAL).hardness(hardressLamp).resistance(resistanceLamp).lightLevel(lightLevelLamp).breakByTool(FabricToolTags.PICKAXES).luminance(lightLevelLamp));

	// Создание собственной категории «ламп» (хоть я и сам против созданий категорий, но это нужно было сделать)
	public static final ItemGroup LampsGroup = FabricItemGroupBuilder.create(
			new Identifier(itemBy, "itemgroup"))
			.icon(() -> new ItemStack(WhiteLamp)) // Иконка категории
			.appendItems(stacks -> { // Добавление предметов в категорию

				// Короткие лампы.
				stacks.add(new ItemStack(WhiteLamp));
				stacks.add(new ItemStack(RedLamp));
				stacks.add(new ItemStack(OrangeLamp));
				stacks.add(new ItemStack(YellowLamp));
				stacks.add(new ItemStack(GreenLamp));
				stacks.add(new ItemStack(BlueLamp));
				stacks.add(new ItemStack(LightBlueLamp));
				stacks.add(new ItemStack(PinkLamp));
				stacks.add(new ItemStack(LightGrayLamp));
				stacks.add(new ItemStack(BlackLamp));
				stacks.add(new ItemStack(BrownLamp));
				stacks.add(new ItemStack(LimeLamp));

				// Высокие лампы.
				stacks.add(new ItemStack(TallWhiteLamp));
				stacks.add(new ItemStack(TallRedLamp));
				stacks.add(new ItemStack(TallOrangeLamp));
				stacks.add(new ItemStack(TallYellowLamp));
				stacks.add(new ItemStack(TallGreenLamp));
				stacks.add(new ItemStack(TallBlueLamp));
				stacks.add(new ItemStack(TallLightBlueLamp));
				stacks.add(new ItemStack(TallPinkLamp));
				stacks.add(new ItemStack(TallLightGrayLamp));
				stacks.add(new ItemStack(TallBlackLamp));
				stacks.add(new ItemStack(TallBrownLamp));
				stacks.add(new ItemStack(TallLimeLamp));

				// Предметы.
				stacks.add(new ItemStack(LampCover));
				stacks.add(new ItemStack(Lightbulb));
				stacks.add(new ItemStack(IronRod));
			})
			.build();

	// Инициализация кода.
	@Override
	public void onInitialize() {

		// Регистрация предметов в игру.
		Registry.register(Registry.ITEM, new Identifier(itemBy, "lamp_cover"), LampCover);
		Registry.register(Registry.ITEM, new Identifier(itemBy, "lightbulb"), Lightbulb);
		Registry.register(Registry.ITEM, new Identifier(itemBy, "iron_rod"), IronRod);

		// Регистрация коротких ламп в игру.
		Registry.register(Registry.BLOCK, new Identifier(itemBy, "white_lamp"), WhiteLamp);
		Registry.register(Registry.BLOCK, new Identifier(itemBy, "red_lamp"), RedLamp);
		Registry.register(Registry.BLOCK, new Identifier(itemBy, "orange_lamp"), OrangeLamp);
		Registry.register(Registry.BLOCK, new Identifier(itemBy, "yellow_lamp"), YellowLamp);
		Registry.register(Registry.BLOCK, new Identifier(itemBy, "green_lamp"), GreenLamp);
		Registry.register(Registry.BLOCK, new Identifier(itemBy, "blue_lamp"), BlueLamp);
		Registry.register(Registry.BLOCK, new Identifier(itemBy, "light_blue_lamp"), LightBlueLamp);
		Registry.register(Registry.BLOCK, new Identifier(itemBy, "pink_lamp"), PinkLamp);
		Registry.register(Registry.BLOCK, new Identifier(itemBy, "light_gray_lamp"), LightGrayLamp);
		Registry.register(Registry.BLOCK, new Identifier(itemBy, "black_lamp"), BlackLamp);
		Registry.register(Registry.BLOCK, new Identifier(itemBy, "brown_lamp"), BrownLamp);
		Registry.register(Registry.BLOCK, new Identifier(itemBy, "lime_lamp"), LimeLamp);

		// Регистрация высоких ламп в игру.
		Registry.register(Registry.BLOCK, new Identifier(itemBy, "tall_white_lamp"), TallWhiteLamp);
		Registry.register(Registry.BLOCK, new Identifier(itemBy, "tall_red_lamp"), TallRedLamp);
		Registry.register(Registry.BLOCK, new Identifier(itemBy, "tall_orange_lamp"), TallOrangeLamp);
		Registry.register(Registry.BLOCK, new Identifier(itemBy, "tall_yellow_lamp"), TallYellowLamp);
		Registry.register(Registry.BLOCK, new Identifier(itemBy, "tall_green_lamp"), TallGreenLamp);
		Registry.register(Registry.BLOCK, new Identifier(itemBy, "tall_blue_lamp"), TallBlueLamp);
		Registry.register(Registry.BLOCK, new Identifier(itemBy, "tall_light_blue_lamp"), TallLightBlueLamp);
		Registry.register(Registry.BLOCK, new Identifier(itemBy, "tall_pink_lamp"), TallPinkLamp);
		Registry.register(Registry.BLOCK, new Identifier(itemBy, "tall_light_gray_lamp"), TallLightGrayLamp);
		Registry.register(Registry.BLOCK, new Identifier(itemBy, "tall_black_lamp"), TallBlackLamp);
		Registry.register(Registry.BLOCK, new Identifier(itemBy, "tall_brown_lamp"), TallBrownLamp);
		Registry.register(Registry.BLOCK, new Identifier(itemBy, "tall_lime_lamp"), TallLimeLamp);

		// Регистрация коротких ламп в категории игры.
		Registry.register(Registry.ITEM, new Identifier(itemBy, "white_lamp"), new BlockItem(WhiteLamp, new Item.Settings().group(LampsGroup)));
		Registry.register(Registry.ITEM, new Identifier(itemBy, "red_lamp"), new BlockItem(RedLamp, new Item.Settings().group(LampsGroup)));
		Registry.register(Registry.ITEM, new Identifier(itemBy, "orange_lamp"), new BlockItem(OrangeLamp, new Item.Settings().group(LampsGroup)));
		Registry.register(Registry.ITEM, new Identifier(itemBy, "yellow_lamp"), new BlockItem(YellowLamp, new Item.Settings().group(LampsGroup)));
		Registry.register(Registry.ITEM, new Identifier(itemBy, "green_lamp"), new BlockItem(GreenLamp, new Item.Settings().group(LampsGroup)));
		Registry.register(Registry.ITEM, new Identifier(itemBy, "blue_lamp"), new BlockItem(BlueLamp, new Item.Settings().group(LampsGroup)));
		Registry.register(Registry.ITEM, new Identifier(itemBy, "light_blue_lamp"), new BlockItem(LightBlueLamp, new Item.Settings().group(LampsGroup)));
		Registry.register(Registry.ITEM, new Identifier(itemBy, "pink_lamp"), new BlockItem(PinkLamp, new Item.Settings().group(LampsGroup)));
		Registry.register(Registry.ITEM, new Identifier(itemBy, "light_gray_lamp"), new BlockItem(LightGrayLamp, new Item.Settings().group(LampsGroup)));
		Registry.register(Registry.ITEM, new Identifier(itemBy, "black_lamp"), new BlockItem(BlackLamp, new Item.Settings().group(LampsGroup)));
		Registry.register(Registry.ITEM, new Identifier(itemBy, "brown_lamp"), new BlockItem(BrownLamp, new Item.Settings().group(LampsGroup)));
		Registry.register(Registry.ITEM, new Identifier(itemBy, "lime_lamp"), new BlockItem(LimeLamp, new Item.Settings().group(LampsGroup)));

		// Регистрация высоких ламп в категории игры.
		Registry.register(Registry.ITEM, new Identifier(itemBy, "tall_white_lamp"), new BlockItem(TallWhiteLamp, new Item.Settings().group(LampsGroup)));
		Registry.register(Registry.ITEM, new Identifier(itemBy, "tall_red_lamp"), new BlockItem(TallRedLamp, new Item.Settings().group(LampsGroup)));
		Registry.register(Registry.ITEM, new Identifier(itemBy, "tall_orange_lamp"), new BlockItem(TallOrangeLamp, new Item.Settings().group(LampsGroup)));
		Registry.register(Registry.ITEM, new Identifier(itemBy, "tall_yellow_lamp"), new BlockItem(TallYellowLamp, new Item.Settings().group(LampsGroup)));
		Registry.register(Registry.ITEM, new Identifier(itemBy, "tall_green_lamp"), new BlockItem(TallGreenLamp, new Item.Settings().group(LampsGroup)));
		Registry.register(Registry.ITEM, new Identifier(itemBy, "tall_blue_lamp"), new BlockItem(TallBlueLamp, new Item.Settings().group(LampsGroup)));
		Registry.register(Registry.ITEM, new Identifier(itemBy, "tall_light_blue_lamp"), new BlockItem(TallLightBlueLamp, new Item.Settings().group(LampsGroup)));
		Registry.register(Registry.ITEM, new Identifier(itemBy, "tall_pink_lamp"), new BlockItem(TallPinkLamp, new Item.Settings().group(LampsGroup)));
		Registry.register(Registry.ITEM, new Identifier(itemBy, "tall_light_gray_lamp"), new BlockItem(TallLightGrayLamp, new Item.Settings().group(LampsGroup)));
		Registry.register(Registry.ITEM, new Identifier(itemBy, "tall_black_lamp"), new BlockItem(TallBlackLamp, new Item.Settings().group(LampsGroup)));
		Registry.register(Registry.ITEM, new Identifier(itemBy, "tall_brown_lamp"), new BlockItem(TallBrownLamp, new Item.Settings().group(LampsGroup)));
		Registry.register(Registry.ITEM, new Identifier(itemBy, "tall_lime_lamp"), new BlockItem(TallLimeLamp, new Item.Settings().group(LampsGroup)));
	}
}
