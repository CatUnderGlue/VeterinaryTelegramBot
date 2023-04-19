package ru.codehunters.zaepestelegrambot.service;

import ru.codehunters.zaepestelegrambot.exception.NotFoundException;
import ru.codehunters.zaepestelegrambot.model.animals.Dog;

import java.util.List;

public interface DogService {
    /**
     * Возвращает объект собаки по его идентификатору.
     *
     * @param id идентификатор собаки в базе данных
     * @return объект собаки с указанным идентификатором
     * @throws NotFoundException если собака с указанным идентификатором не найдена в базе данных
     */
    Dog getById(Long id);

    /**
     * Возвращает объект собаки, принадлежащей хозяину с указанным идентификатором.
     *
     * @param id идентификатор хозяина собаки в базе данных
     * @return собаки принадлежащие к указанному хозяину
     * @throws NotFoundException если собака с хозяином, имеющим указанный идентификатор, не найдена в базе данных
     */
    List<Dog> getAllByUserId(Long id);

    /**
     * Создает новую запись о собаке в базе данных, используя переданный объект собаки.
     *
     * @param dog объект собаки, содержащий информацию о создаваемой записи
     * @return созданный объект собаки с присвоенным идентификатором, сохраненный в базе данных
     */
    Dog create(Dog dog);

    /**
     * Обновляет информацию о собаке, используя переданный объект собаки.
     *
     * @param dog объект собаки, содержащий обновленную информацию
     * @return объект собаки с обновленной информацией, сохраненный в базе данных
     * @throws NotFoundException если переданный объект собаки не найден в базе данных
     */
    Dog update(Dog dog);

    /**
     * Возвращает коллекцию всех объектов собаки, находящихся в базе данных.
     *
     * @return коллекция всех объектов собаки, находящихся в базе данных
     */
    List<Dog> getAll();

    /**
     * Удаляет запись о собаке с указанным идентификатором из базы данных.
     *
     * @param id идентификатор собаки, которую нужно удалить
     */
    void remove(Long id);
}
