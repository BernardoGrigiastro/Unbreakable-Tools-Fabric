package omgitzbunnygirl.unbreakabletoolsfabric;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import omgitzbunnygirl.unbreakabletoolsfabric.item.*;

public class UnbreakableToolsFabric implements ModInitializer {

    public static final ItemGroup UNBREAKABLE_TOOLS_GROUP = FabricItemGroupBuilder.build(new Identifier("unbreakabletoolsfabric", "unbreakable_tools_group"), () -> new ItemStack(Items.ENCHANTED_BOOK));


    // Tools
    // Wooden
    public static ToolItem UNBREAKABLE_WOODEN_PICKAXE = new UnbreakablePickaxeItem(ToolMaterials.WOOD, 1, -2.8F, new Item.Settings().group(UNBREAKABLE_TOOLS_GROUP).maxDamage(-2147483648));
    public static ToolItem UNBREAKABLE_WOODEN_AXE = new UnbreakableAxeItem(ToolMaterials.WOOD, 6.0F, -3.2F, new Item.Settings().group(UNBREAKABLE_TOOLS_GROUP).maxDamage(-2147483648));
    public static ToolItem UNBREAKABLE_WOODEN_HOE = new UnbreakableHoeItem(ToolMaterials.WOOD, -3.0F, new Item.Settings().group(UNBREAKABLE_TOOLS_GROUP).maxDamage(-2147483648));
    public static ToolItem UNBREAKABLE_WOODEN_SHOVEL = new UnbreakableShovelItem(ToolMaterials.WOOD, 1.5F, -3.0F, new Item.Settings().group(UNBREAKABLE_TOOLS_GROUP).maxDamage(-2147483648));
    public static ToolItem UNBREAKABLE_WOODEN_SWORD = new UnbreakableSwordItem(ToolMaterials.WOOD, 3, -2.8F, new Item.Settings().group(UNBREAKABLE_TOOLS_GROUP).maxDamage(-2147483648));

    // Stone
    public static ToolItem UNBREAKABLE_STONE_PICKAXE = new UnbreakablePickaxeItem(ToolMaterials.STONE, 1, -2.8F, new Item.Settings().group(UNBREAKABLE_TOOLS_GROUP).maxDamage(-2147483648));
    public static ToolItem UNBREAKABLE_STONE_AXE = new UnbreakableAxeItem(ToolMaterials.STONE, 7.0F, -3.2F, new Item.Settings().group(UNBREAKABLE_TOOLS_GROUP).maxDamage(-2147483648));
    public static ToolItem UNBREAKABLE_STONE_HOE = new UnbreakableHoeItem(ToolMaterials.STONE, -2.0F, new Item.Settings().group(UNBREAKABLE_TOOLS_GROUP).maxDamage(-2147483648));
    public static ToolItem UNBREAKABLE_STONE_SHOVEL = new UnbreakableShovelItem(ToolMaterials.STONE, 1.5F, -3.0F, new Item.Settings().group(UNBREAKABLE_TOOLS_GROUP).maxDamage(-2147483648));
    public static ToolItem UNBREAKABLE_STONE_SWORD = new UnbreakableSwordItem(ToolMaterials.STONE, 3, -2.4F, new Item.Settings().group(UNBREAKABLE_TOOLS_GROUP).maxDamage(-2147483648));

    // Iron
    public static ToolItem UNBREAKABLE_IRON_PICKAXE = new UnbreakablePickaxeItem(ToolMaterials.IRON, 1, -2.8F, new Item.Settings().group(UNBREAKABLE_TOOLS_GROUP).maxDamage(-2147483648));
    public static ToolItem UNBREAKABLE_IRON_AXE = new UnbreakableAxeItem(ToolMaterials.IRON, 6.0F, -3.1F, new Item.Settings().group(UNBREAKABLE_TOOLS_GROUP).maxDamage(-2147483648));
    public static ToolItem UNBREAKABLE_IRON_HOE = new UnbreakableHoeItem(ToolMaterials.IRON, -1.0F, new Item.Settings().group(UNBREAKABLE_TOOLS_GROUP).maxDamage(-2147483648));
    public static ToolItem UNBREAKABLE_IRON_SHOVEL = new UnbreakableShovelItem(ToolMaterials.IRON, 1.5F, -3.0F, new Item.Settings().group(UNBREAKABLE_TOOLS_GROUP).maxDamage(-2147483648));
    public static ToolItem UNBREAKABLE_IRON_SWORD = new UnbreakableSwordItem(ToolMaterials.IRON, 3, -2.4F, new Item.Settings().group(UNBREAKABLE_TOOLS_GROUP).maxDamage(-2147483648));

    // Diamond
    public static ToolItem UNBREAKABLE_DIAMOND_PICKAXE = new UnbreakablePickaxeItem(ToolMaterials.DIAMOND, 1, -2.8F, new Item.Settings().group(UNBREAKABLE_TOOLS_GROUP).maxDamage(-2147483648));
    public static ToolItem UNBREAKABLE_DIAMOND_AXE = new UnbreakableAxeItem(ToolMaterials.DIAMOND, 5.0F, -3.0F, new Item.Settings().group(UNBREAKABLE_TOOLS_GROUP).maxDamage(-2147483648));
    public static ToolItem UNBREAKABLE_DIAMOND_HOE = new UnbreakableHoeItem(ToolMaterials.DIAMOND, -0.0F, new Item.Settings().group(UNBREAKABLE_TOOLS_GROUP).maxDamage(-2147483648));
    public static ToolItem UNBREAKABLE_DIAMOND_SHOVEL = new UnbreakableShovelItem(ToolMaterials.DIAMOND, 1.5F, -3.0F, new Item.Settings().group(UNBREAKABLE_TOOLS_GROUP).maxDamage(-2147483648));
    public static ToolItem UNBREAKABLE_DIAMOND_SWORD = new UnbreakableSwordItem(ToolMaterials.DIAMOND, 3, -2.4F, new Item.Settings().group(UNBREAKABLE_TOOLS_GROUP).maxDamage(-2147483648));

    // Golden
    public static ToolItem UNBREAKABLE_GOLDEN_PICKAXE = new UnbreakablePickaxeItem(ToolMaterials.GOLD, 1, -2.8F, new Item.Settings().group(UNBREAKABLE_TOOLS_GROUP).maxDamage(-2147483648));
    public static ToolItem UNBREAKABLE_GOLDEN_AXE = new UnbreakableAxeItem(ToolMaterials.GOLD, 6.0F, -3.0F, new Item.Settings().group(UNBREAKABLE_TOOLS_GROUP).maxDamage(-2147483648));
    public static ToolItem UNBREAKABLE_GOLDEN_HOE = new UnbreakableHoeItem(ToolMaterials.GOLD, -3.0F, new Item.Settings().group(UNBREAKABLE_TOOLS_GROUP).maxDamage(-2147483648));
    public static ToolItem UNBREAKABLE_GOLDEN_SHOVEL = new UnbreakableShovelItem(ToolMaterials.GOLD, 1.5F, -3.0F, new Item.Settings().group(UNBREAKABLE_TOOLS_GROUP).maxDamage(-2147483648));
    public static ToolItem UNBREAKABLE_GOLDEN_SWORD = new UnbreakableSwordItem(ToolMaterials.GOLD, 3, -2.4F, new Item.Settings().group(UNBREAKABLE_TOOLS_GROUP).maxDamage(-2147483648));

    // Other Tools
    public static UnbreakableBowItem UNBREAKABLE_BOW = new UnbreakableBowItem(new Item.Settings().group(UNBREAKABLE_TOOLS_GROUP).maxDamage(-2147483648));

    @Override
    public void onInitialize() {
        // Tools
        // Wooden
        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsfabric", "unbreakable_wooden_pickaxe"), UNBREAKABLE_WOODEN_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsfabric", "unbreakable_wooden_axe"), UNBREAKABLE_WOODEN_AXE);
        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsfabric", "unbreakable_wooden_hoe"), UNBREAKABLE_WOODEN_HOE);
        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsfabric", "unbreakable_wooden_shovel"), UNBREAKABLE_WOODEN_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsfabric", "unbreakable_wooden_sword"), UNBREAKABLE_WOODEN_SWORD);

        // Stone
        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsfabric", "unbreakable_stone_pickaxe"), UNBREAKABLE_STONE_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsfabric", "unbreakable_stone_axe"), UNBREAKABLE_STONE_AXE);
        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsfabric", "unbreakable_stone_hoe"), UNBREAKABLE_STONE_HOE);
        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsfabric", "unbreakable_stone_shovel"), UNBREAKABLE_STONE_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsfabric", "unbreakable_stone_sword"), UNBREAKABLE_STONE_SWORD);

        // Iron
        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsfabric", "unbreakable_iron_pickaxe"), UNBREAKABLE_IRON_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsfabric", "unbreakable_iron_axe"), UNBREAKABLE_IRON_AXE);
        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsfabric", "unbreakable_iron_hoe"), UNBREAKABLE_IRON_HOE);
        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsfabric", "unbreakable_iron_shovel"), UNBREAKABLE_IRON_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsfabric", "unbreakable_iron_sword"), UNBREAKABLE_IRON_SWORD);

        // Diamond
        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsfabric", "unbreakable_diamond_pickaxe"), UNBREAKABLE_DIAMOND_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsfabric", "unbreakable_diamond_axe"), UNBREAKABLE_DIAMOND_AXE);
        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsfabric", "unbreakable_diamond_hoe"), UNBREAKABLE_DIAMOND_HOE);
        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsfabric", "unbreakable_diamond_shovel"), UNBREAKABLE_DIAMOND_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsfabric", "unbreakable_diamond_sword"), UNBREAKABLE_DIAMOND_SWORD);

        // Golden
        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsfabric", "unbreakable_golden_pickaxe"), UNBREAKABLE_GOLDEN_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsfabric", "unbreakable_golden_axe"), UNBREAKABLE_GOLDEN_AXE);
        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsfabric", "unbreakable_golden_hoe"), UNBREAKABLE_GOLDEN_HOE);
        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsfabric", "unbreakable_golden_shovel"), UNBREAKABLE_GOLDEN_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsfabric", "unbreakable_golden_sword"), UNBREAKABLE_GOLDEN_SWORD);

        // Other Tools
        Registry.register(Registry.ITEM, new Identifier("unbreakabletoolsfabric", "unbreakable_bow"), UNBREAKABLE_BOW);

    }
}
