# Телеграмм-бот для приюта животных

## Функциональность телеграмм-бота
**Этап 0. Определение запроса** 
- Бот приветствует нового пользователя, рассказывает о себе и может выдать меню на выбор, с каким запросом пришел пользователь:
    - Узнать информацию о приюте (этап 1).
    - Как взять собаку из приюта (этап 2).
    - Прислать отчет о питомце (этап 3).
    - Позвать волонтера.
- Если ни один из вариантов не подходит, то бот может позвать волонтера.
- Если пользователь уже обращался к боту ранее, то новое обращение начинается с выбора запроса, с которым пришел пользователь.

**Этап 1. Консультация с новым пользователем** 

На данном этапе бот должен давать вводную информацию о приюте: где он находится, как и когда работает, какие правила пропуска на территорию приюта, правила нахождения внутри и общения с собаками.

**Этап 2. Консультация с потенциальным хозяином животного из приюта** 

На данном этапе бот помогает потенциальным «усыновителям» собаки из приюта разобраться с бюрократическими (как оформить договор) и бытовыми (как подготовиться к жизни с собакой) вопросами. 
Основная задача — дать максимально полную информацию о том, как предстоит подготовиться человеку ко встрече с новым членом семьи.

**Этап 3. Ведение питомца** 

После того, как новый усыновитель забрал собаку из приюта, он обязан в течение месяца присылать информацию о том, как животное чувствует себя на новом месте. В ежедневный отчет входит следующая информация: 

- Фото животного.
- Рацион животного.
- Общее самочувствие и привыкание к новому месту.
- Изменение в поведении: отказ от старых привычек, приобретение новых.

Как только период в 30 дней заканчивается, волонтеры принимают решение о том, остается собака у хозяина или нет. Испытательный срок может быть пройден, может быть продлен на любое количество дней, а может быть не пройден. 

- Бот может прислать форму ежедневного отчета.
- Если пользователь прислал только фото, то бот может запросить текст.
- Если пользователь прислал только текст, то бот может запросить фото.
- Бот может выдать предупреждение о том, что отчет заполняется плохо (делает волонтер): 

«*Дорогой усыновитель, мы заметили, что ты заполняешь отчет не так подробно, как необходимо. Пожалуйста, подойди ответственнее к этому занятию. В противном случае волонтеры приюта будут обязаны самолично проверять условия содержания собаки».*
- Если усыновитель прошел испытательный срок, то бот поздравляет его стандартным сообщением.
- Если усыновителю было назначено дополнительное время испытательного срока, то бот сообщает ему и указывает количество дополнительных дней.
- Если усыновитель не прошел испытательный срок, то бот уведомляет его об этом и дает инструкции по дальнейшим шагам.