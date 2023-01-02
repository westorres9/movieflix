import { Movie } from '../../../../core/types/Movie';
import './styles.scss'

type Props = {
  movie: Movie
}

const MovieCard = ({ movie }: Props) => {
  return (
    <div className='row'>
      <div className="movie-card-container col-md-3">
      <img
        src={ movie.imgUrl }
        alt={ movie.title }
        className="movie-image"
        data-testid="movie-image"
      />

      <div className="movie-info-container">
        <h3 className="movie-title">
          { movie.title }
        </h3>
        <span className="movie-year">{ movie.year }</span>
        <h4 className="movie-subtitle">{ movie.subTitle }</h4>
      </div>
    </div>
    </div>
  )
}

export default MovieCard