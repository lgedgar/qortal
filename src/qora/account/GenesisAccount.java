package qora.account;

import repository.DataException;
import repository.Repository;

public final class GenesisAccount extends PublicKeyAccount {

	public static final byte[] PUBLIC_KEY = new byte[] { 1, 1, 1, 1, 1, 1, 1, 1 };

	public GenesisAccount(Repository repository) throws DataException {
		super(repository, PUBLIC_KEY);
	}

}
