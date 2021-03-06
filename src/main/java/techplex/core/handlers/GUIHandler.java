package techplex.core.handlers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import techplex.core.inventory.container.ContainerAlloyFurnace;
import techplex.core.inventory.gui.GUIAlloyFurnace;
import techplex.core.tileentity.TileEntityAlloyFurnace;

public class GUIHandler implements IGuiHandler
{
	public static final int	GUIID_ALLOYFURNACE = 1;


	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{

		BlockPos pos = new BlockPos(x, y, z);

		TileEntity tileEntity = world.getTileEntity(pos);

		if (tileEntity instanceof TileEntityAlloyFurnace)
		{
			TileEntityAlloyFurnace tileEntityAlloy = (TileEntityAlloyFurnace) tileEntity;
			return new ContainerAlloyFurnace(player, tileEntityAlloy);
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{

		BlockPos pos = new BlockPos(x, y, z);

		TileEntity tileEntity = world.getTileEntity(pos);

		if (tileEntity instanceof TileEntityAlloyFurnace)
		{
			TileEntityAlloyFurnace tileEntityAlloy = (TileEntityAlloyFurnace) tileEntity;
			return new GUIAlloyFurnace(player, tileEntityAlloy);
		}
		return null;
	}
}
