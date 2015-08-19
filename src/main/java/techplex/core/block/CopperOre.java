package techplex.core.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import techplex.TechPlex;
import techplex.core.CreativeTabsTechPlex;

public class CopperOre extends Block {
	public static final String BLOCKID = "copperOre";
	
	public CopperOre() {
		super(Material.rock);
		setHardness(3.0F);
		setResistance(5.0f);
        setStepSound(Block.soundTypeStone);
        setUnlocalizedName(TechPlex.MODID + "_" + BLOCKID);
        setCreativeTab(CreativeTabsTechPlex.tabTechPlex);
	}
}
