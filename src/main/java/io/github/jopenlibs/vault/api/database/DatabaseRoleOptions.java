package io.github.jopenlibs.vault.api.database;

import java.util.ArrayList;
import java.util.List;

public class DatabaseRoleOptions {

    private String name;
    private String dbName;
    private String defaultTtl;
    private String maxTtl;
    private String ttl;
    private String username;
    private String lastVaultRotation;
    private String rotationPeriod;
    private List<String> creationStatements = new ArrayList<>();
    private List<String> revocationStatements = new ArrayList<>();
    private List<String> rollbackStatements = new ArrayList<>();
    private List<String> rotationStatements = new ArrayList<>();
    private List<String> renewStatements = new ArrayList<>();

    public String getName() {
        return name;
    }

    public String getDbName() {
        return dbName;
    }

    public String getDefaultTtl() {
        return defaultTtl;
    }

    public String getMaxTtl() {
        return maxTtl;
    }

    public String getTtl() {
        return ttl;
    }

    public String getUsername() {
        return username;
    }

    public String getLastVaultRotation() {
        return lastVaultRotation;
    }

    public String getRotationPeriod() {
        return rotationPeriod;
    }

    public List<String> getCreationStatements() {
        return creationStatements;
    }

    public List<String> getRenewStatements() {
        return renewStatements;
    }

    public List<String> getRevocationStatements() {
        return revocationStatements;
    }

    public List<String> getRollbackStatements() {
        return rollbackStatements;
    }

    public List<String> getRotationStatements() {
        return rotationStatements;
    }

    /**
     * @param name {@code String} – Specifies the name of the role to create. This is specified as
     * part of the URL.
     * @return This object, with name populated, ready for other builder methods or immediate use.
     */
    public DatabaseRoleOptions name(final String name) {
        this.name = name;
        return this;
    }

    /**
     * @param dbName {@code String} - The name of the database connection to use for this role.
     * @return This object, with dbName populated, ready for other builder methods or immediate use.
     */
    public DatabaseRoleOptions dbName(final String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * @param defaultTtl (string/int: 0) - Specifies the TTL for the leases associated with this
     * role. Accepts time suffixed strings ("1h") or an integer number of seconds. Defaults to
     * system/engine default TTL time.
     * @return This object, with defaultTtl populated, ready for other builder methods or immediate
     * use.
     */
    public DatabaseRoleOptions defaultTtl(final String defaultTtl) {
        this.defaultTtl = defaultTtl;
        return this;
    }

    /**
     * @param maxTtl (string/int: 0) - Specifies the maximum TTL for the leases associated with this
     * role. Accepts time suffixed strings ("1h") or an integer number of seconds. Defaults to
     * system/mount default TTL time; this value is allowed to be less than the mount max TTL (or,
     * if not set, the system max TTL), but it is not allowed to be longer. See also The TTL General
     * Case.
     * @return This object, with maxTtl populated, ready for other builder methods or immediate use.
     */
    public DatabaseRoleOptions maxTtl(final String maxTtl) {
        this.maxTtl = maxTtl;
        return this;
    }

    /**
     * @param ttl (string/int: 0) - Specifies the remaining TTL for the password of a static role.
     * @return This object, with ttl populated, ready for other builder methods or immediate use.
     */
    public DatabaseRoleOptions ttl(final String ttl) {
        this.ttl = ttl;
        return this;
    }

    /**
     * @param username {@code String} – Specifies the username of database user to use when creating
     * the static role.
     * @return This object, with username populated, ready for other builder methods or immediate
     * use.
     */
    public DatabaseRoleOptions username(final String username) {
        this.username = username;
        return this;
    }

    /**
     * @param lastVaultRotation {@code String} – Specifies the last time a rotation operation was
     * successfully completed.
     * @return This object, with lastVaultRotation populated, ready for other builder methods or
     * immediate use.
     */
    public DatabaseRoleOptions lastVaultRotation(final String lastVaultRotation) {
        this.lastVaultRotation = lastVaultRotation;
        return this;
    }

    /**
     * @param rotationPeriod {@code String} – Specifies the rotation period for the static role.
     * @return This object, with rotationPeriod populated, ready for other builder methods or
     * immediate use.
     */
    public DatabaseRoleOptions rotationPeriod(final String rotationPeriod) {
        this.rotationPeriod = rotationPeriod;
        return this;
    }

    /**
     * @param creationStatements {@code List<String>} – Specifies the database statements executed
     * to create and configure a user. See the plugin's API page for more information on support and
     * formatting for this parameter.
     * @return This object, with creationStatements populated, ready for other builder methods or
     * immediate use.
     */
    public DatabaseRoleOptions creationStatements(final List<String> creationStatements) {
        this.creationStatements = creationStatements;
        return this;
    }

    /**
     * @param revocationStatements (list: []) – Specifies the database statements to be executed to
     * revoke a user. See the plugin's API page for more information on support and formatting for
     * this parameter.
     * @return This object, with revocationStatements populated, ready for other builder methods or
     * immediate use.
     */
    public DatabaseRoleOptions revocationStatements(final List<String> revocationStatements) {
        this.revocationStatements = revocationStatements;
        return this;
    }

    /**
     * @param rollbackStatements (list: []) – Specifies the database statements to be executed
     * rollback a create operation in the event of an error. Not every plugin type will support this
     * functionality. See the plugin's API page for more information on support and formatting for
     * this parameter.
     * @return This object, with rollbackStatements populated, ready for other builder methods or
     * immediate use.
     */
    public DatabaseRoleOptions rollbackStatements(final List<String> rollbackStatements) {
        this.rollbackStatements = rollbackStatements;
        return this;
    }

    /**
     * @param rotationStatements (list: []) – Specifies the database statements to be executed to
     * rotate a password. Not every plugin type will support this functionality. See the plugin's
     * API page for more information on support and formatting for this parameter.
     * @return This object, with rotationStatements populated, ready for other builder methods or
     * immediate use.
     */
    public DatabaseRoleOptions rotationStatements(final List<String> rotationStatements) {
        this.rotationStatements = rotationStatements;
        return this;
    }

    /**
     * @param renewStatements (list: []) – Specifies the database statements to be executed to renew
     * a user. Not every plugin type will support this functionality. See the plugin's API page for
     * more information on support and formatting for this parameter.
     * @return This object, with renewStatements populated, ready for other builder methods or
     * immediate use.
     */
    public DatabaseRoleOptions renewStatements(final List<String> renewStatements) {
        this.renewStatements = renewStatements;
        return this;
    }
}
