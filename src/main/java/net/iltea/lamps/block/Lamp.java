package net.iltea.lamps.block;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.fabricmc.fabric.api.event.client.ClientTickCallback;
import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.text.LiteralText;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class Lamp extends HorizontalFacingBlock {

    public Lamp(Settings settings) {
        super(settings);
        setDefaultState(this.stateManager.getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> stateManager) {
        stateManager.add(Properties.HORIZONTAL_FACING);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext ctx) {
        Direction dir = state.get(FACING);
        switch(dir) {
            case NORTH:
                return VoxelShapes.cuboid(0.25f, 0.0f, 0.25f, 0.75f, 1.0f, 0.75f);
            case SOUTH:
                return VoxelShapes.cuboid(0.25f, 0.0f, 0.25f, 0.75f, 1.0f, 0.75f);
            case EAST:
                return VoxelShapes.cuboid(0.25f, 0.0f, 0.25f, 0.75f, 1.0f, 0.75f);
            case WEST:
                return VoxelShapes.cuboid(0.25f, 0.0f, 0.25f, 0.75f, 1.0f, 0.75f);
            default:
                return VoxelShapes.fullCube();
        }
    }

    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return (BlockState)this.getDefaultState().with(FACING, ctx.getPlayerFacing());
    }

    // Нужно сделать выключатель света
    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        return super.onUse(state, world, pos, player, hand, hit);
    }
}