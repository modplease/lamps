package net.iltea.lamps.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class TallLamp extends HorizontalFacingBlock {

    public TallLamp(Settings settings) {
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
                return VoxelShapes.cuboid(0.25f, 0.0f, 0.25f, 0.75f, 2.0f, 0.75f);
            case SOUTH:
                return VoxelShapes.cuboid(0.25f, 0.0f, 0.25f, 0.75f, 2.0f, 0.75f);
            case EAST:
                return VoxelShapes.cuboid(0.25f, 0.0f, 0.25f, 0.75f, 2.0f, 0.75f);
            case WEST:
                return VoxelShapes.cuboid(0.25f, 0.0f, 0.25f, 0.75f, 2.0f, 0.75f);
            default:
                return VoxelShapes.fullCube();
        }
    }

    @Override
    public VoxelShape getVisualShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        Direction dir = state.get(FACING);
        switch(dir) {
            case NORTH:
                return VoxelShapes.cuboid(0.25f, 0.0f, 0.25f, 0.75f, 2.0f, 0.75f);
            case SOUTH:
                return VoxelShapes.cuboid(0.25f, 0.0f, 0.25f, 0.75f, 2.0f, 0.75f);
            case EAST:
                return VoxelShapes.cuboid(0.25f, 0.0f, 0.25f, 0.75f, 2.0f, 0.75f);
            case WEST:
                return VoxelShapes.cuboid(0.25f, 0.0f, 0.25f, 0.75f, 2.0f, 0.75f);
            default:
                return VoxelShapes.fullCube();
        }
    }

    @Override
    public VoxelShape getCullingShape(BlockState state, BlockView world, BlockPos pos) {
        Direction dir = state.get(FACING);
        switch(dir) {
            case NORTH:
                return VoxelShapes.cuboid(0.25f, 0.0f, 0.25f, 0.75f, 2.0f, 0.75f);
            case SOUTH:
                return VoxelShapes.cuboid(0.25f, 0.0f, 0.25f, 0.75f, 2.0f, 0.75f);
            case EAST:
                return VoxelShapes.cuboid(0.25f, 0.0f, 0.25f, 0.75f, 2.0f, 0.75f);
            case WEST:
                return VoxelShapes.cuboid(0.25f, 0.0f, 0.25f, 0.75f, 2.0f, 0.75f);
            default:
                return VoxelShapes.fullCube();
        }
    }

    @Override
    public VoxelShape getSidesShape(BlockState state, BlockView world, BlockPos pos) {
        Direction dir = state.get(FACING);
        switch(dir) {
            case NORTH:
                return VoxelShapes.cuboid(0.25f, 0.0f, 0.25f, 0.75f, 2.0f, 0.75f);
            case SOUTH:
                return VoxelShapes.cuboid(0.25f, 0.0f, 0.25f, 0.75f, 2.0f, 0.75f);
            case EAST:
                return VoxelShapes.cuboid(0.25f, 0.0f, 0.25f, 0.75f, 2.0f, 0.75f);
            case WEST:
                return VoxelShapes.cuboid(0.25f, 0.0f, 0.25f, 0.75f, 2.0f, 0.75f);
            default:
                return VoxelShapes.fullCube();
        }
    }

    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return (BlockState)this.getDefaultState().with(FACING, ctx.getPlayerFacing());
    }

}