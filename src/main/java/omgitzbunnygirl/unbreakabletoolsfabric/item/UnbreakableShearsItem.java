package omgitzbunnygirl.unbreakabletoolsfabric.item;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ShearsItem;

public class UnbreakableShearsItem extends ShearsItem {
    public UnbreakableShearsItem(Settings settings) {
        super(settings);
    }

    @Override
    public boolean hasEnchantmentGlint(ItemStack stack) {
        return true;
    }
}
