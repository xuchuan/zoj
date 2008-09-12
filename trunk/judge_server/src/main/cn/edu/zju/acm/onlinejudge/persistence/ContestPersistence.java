/*
 * Copyright 2007 Zhang, Zheng <oldbig@gmail.com>
 * 
 * This file is part of ZOJ.
 * 
 * ZOJ is free software; you can redistribute it and/or modify it under the terms of the GNU General Public License as
 * published by the Free Software Foundation; either revision 3 of the License, or (at your option) any later revision.
 * 
 * ZOJ is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with ZOJ. if not, see
 * <http://www.gnu.org/licenses/>.
 */

package cn.edu.zju.acm.onlinejudge.persistence;

import cn.edu.zju.acm.onlinejudge.bean.AbstractContest;
import cn.edu.zju.acm.onlinejudge.bean.Limit;
import cn.edu.zju.acm.onlinejudge.bean.enumeration.Language;

import java.util.List;

/**
 * <p>
 * ContestPersistence interface defines the API used to manager the contest related affairs in persistence layer.
 * </p>
 * 
 * @version 2.0
 * @author ZOJDEV
 */
public interface ContestPersistence {

    /**
     * Gets the default limit.
     * 
     * @return the defalut limit.
     * @throws PersistenceException
     *             if failed to get the default limit
     */
    Limit getDefaultLimit() throws PersistenceException;

    /**
     * Update the default limit.
     * 
     * @param limit
     *            the defalut limit.
     * @throws PersistenceException
     *             if failed to update the default limit
     */
    void updateDefaultLimit(Limit limit) throws PersistenceException;

    /**
     * <p>
     * Creates the specified contest in persistence layer.
     * </p>
     * 
     * @param contest
     *            the AbstractContest instance to create
     * @param user
     *            the id of the user who made this modification
     * @throws PersistenceException
     *             wrapping a persistence implementation specific exception
     */
    void createContest(AbstractContest contest, long user) throws PersistenceException;

    /**
     * <p>
     * Updates the specified contest in persistence layer.
     * </p>
     * 
     * @param contest
     *            the AbstractContest instance to update
     * @param user
     *            the id of the user who made this modification
     * @throws PersistenceException
     *             wrapping a persistence implementation specific exception
     */
    void updateContest(AbstractContest contest, long user) throws PersistenceException;

    /**
     * <p>
     * Deletes the specified contest in persistence layer.
     * </p>
     * 
     * @param id
     *            the id of the contest to delete
     * @param user
     *            the id of the user who made this modification
     * @throws PersistenceException
     *             wrapping a persistence implementation specific exception
     */
    void deleteContest(long id, long user) throws PersistenceException;

    /**
     * <p>
     * Gets the contest with given id in persistence layer.
     * </p>
     * 
     * @param id
     *            the id of the contest
     * @return the contest with given id in persistence layer
     * @throws PersistenceException
     *             wrapping a persistence implementation specific exception
     */
    AbstractContest getContest(long id) throws PersistenceException;

    /**
     * <p>
     * Gets all contests in persistence layer.
     * </p>
     * 
     * @return a list of AbstractContest instances containing all contests in persistence layer
     * @throws PersistenceException
     *             wrapping a persistence implementation specific exception
     */
    List<AbstractContest> getAllContests() throws PersistenceException;

    /**
     * <p>
     * Gets all problem sets in persistence layer.
     * </p>
     * 
     * @return a list of Problemset instances containing all problem sets in persistence layer
     * @throws PersistenceException
     *             wrapping a persistence implementation specific exception
     */
    List<AbstractContest> getAllProblemsets() throws PersistenceException;

    /**
     * <p>
     * Creates the specified language in persistence layer.
     * </p>
     * 
     * @param language
     *            the Language instance to create
     * @param user
     *            the id of the user who made this modification
     * @throws PersistenceException
     *             wrapping a persistence implementation specific exception
     */
    void createLanguage(Language language, long user) throws PersistenceException;

    /**
     * <p>
     * Updates the specified language in persistence layer.
     * </p>
     * 
     * @param language
     *            the Language instance to update
     * @param user
     *            the id of the user who made this modification
     * @throws PersistenceException
     *             wrapping a persistence implementation specific exception
     */
    void updateLanguage(Language language, long user) throws PersistenceException;

    /**
     * <p>
     * Deletes the specified language in persistence layer.
     * </p>
     * 
     * @param id
     *            the id of the language to delete
     * @param user
     *            the id of the user who made this modification
     * @throws PersistenceException
     *             wrapping a persistence implementation specific exception
     */
    void deleteLanguage(long id, long user) throws PersistenceException;

    /**
     * <p>
     * Gets the language with given id.
     * </p>
     * 
     * @param id
     *            the language id.
     * @return the language with given id or null.
     * @throws PersistenceException
     *             wrapping a persistence implementation specific exception
     */
    Language getLanguage(long id) throws PersistenceException;

    /**
     * <p>
     * Gets all languages in persistence layer.
     * </p>
     * 
     * @return a list of Language instances containing all languages in persistence layer
     * @throws PersistenceException
     *             wrapping a persistence implementation specific exception
     */
    List<Language> getAllLanguages() throws PersistenceException;

    String getLastSubmitIP(long userId, long contestId) throws PersistenceException;

    void setLastSubmitIP(long userId, long contestId, String ip) throws PersistenceException;

}