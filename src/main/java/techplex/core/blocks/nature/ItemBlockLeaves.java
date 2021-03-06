package techplex.core.blocks.nature;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.item.ItemLeaves;
import net.minecraft.item.ItemStack;
import techplex.core.enumtypes.TPWoodType;

/**
 * Similar to vanilla's ItemLeaves, but has a constructor with a parameter of type Block instead of BlockLeaves so GameRegistry can instantiate it.
 * The constructor immediately casts its argument to BlockLeaves, so extending BlockLeaves is still required.
 * <p/>
 * Also overrides getUnlocalizedName to use CustomPlanks.EnumType instead of BlockPlanks.EnumType.
 */
public class ItemBlockLeaves extends ItemLeaves {
	public ItemBlockLeaves(Block block) {
		super((BlockLeaves) block);
		setHasSubtypes(true);
		setMaxStackSize(0);
	}
	
	@Override
	public int getMetadata(int damageValue) {
		return damageValue;
	}

	@Override
	public String getUnlocalizedName(ItemStack item) {
		return TPWoodType.byMetadata(item.getMetadata()) + "_leaves";
	}
}
