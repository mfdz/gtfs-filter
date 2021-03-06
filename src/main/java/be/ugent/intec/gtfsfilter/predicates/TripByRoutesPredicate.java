package be.ugent.intec.gtfsfilter.predicates;

import java.util.Collection;

import org.onebusaway.gtfs.model.Route;
import org.onebusaway.gtfs.model.Trip;

import com.google.common.base.Predicate;

public final class TripByRoutesPredicate implements Predicate<Trip> {

	private final Collection<Route> routes;

	public TripByRoutesPredicate(Collection<Route> routes) {
		super();
		this.routes = routes;
	}

	@Override
	public boolean apply(Trip input) {
		return routes.contains(input.getRoute());
	}
}