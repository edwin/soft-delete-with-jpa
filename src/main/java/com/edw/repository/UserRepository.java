package com.edw.repository;

import com.edw.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 * <pre>
 *     com.edw.repository.UserRepository
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 25 Okt 2023 18:04
 */
public interface UserRepository extends CrudRepository<User, Integer> {
}
