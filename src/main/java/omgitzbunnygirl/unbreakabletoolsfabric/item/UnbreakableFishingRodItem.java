package omgitzbunnygirl.unbreakabletoolsfabric.item;

import net.minecraft.item.FishingRodItem;
import net.minecraft.item.ItemStack;

public class UnbreakableFishingRodItem extends FishingRodItem {
    public UnbreakableFishingRodItem(Settings settings) {
        super(settings);
    }



    @Override
    public boolean hasEnchantmentGlint(ItemStack stack) {
        return true;
    }
}
