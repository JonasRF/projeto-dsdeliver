import ProductCard from "./ProductCard";
import { Product } from "./types";

type Props = {
    products: Product[];
}

const ProductsList = ({ products }: Props) => {
    return (
        <div className='orders-list-container'>
            <div className="orders-list-content">
                {products.map(product => (
                    <ProductCard key={product.id} product={product} />
                ))}

            </div>
        </div>
    )
}

export default ProductsList;