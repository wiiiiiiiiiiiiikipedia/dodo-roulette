import './Home.css'
import { FortunaWheel } from '../../components/fortunaWheel/FortunaWheel'

export const Home = () => {

    return(
        <div className="home">
            <div className="home-wrapper">
                <h1>Title</h1>
                <FortunaWheel/>
            </div>
        </div>
    )
}