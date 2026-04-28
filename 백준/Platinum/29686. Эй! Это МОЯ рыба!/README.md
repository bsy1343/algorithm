# [Platinum IV] Эй! Это МОЯ рыба! - 29686

[문제 링크](https://www.acmicpc.net/problem/29686)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 2, 정답: 1, 맞힌 사람: 1, 정답 비율: 50.000%

### 분류

구현, 다이나믹 프로그래밍, 많은 조건 분기, 비트마스킹, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>Одна из популярных настольных игр &lt;&lt;Эй! Это МОЯ рыба!&gt;&gt; состоит в перемещении пингвинов и сбору рыбы на поле.</p>

<p>Мы рассмотрим упрощенную версию этой игры. Для этой игры используется $n$ карточек с изображениями нескольких рыб и фишки-пингвины.</p>

<p>В начале игры карточки выкладываются на столе в ряд в некотором порядке.</p>

<p>Каждому игроку выдается по два пингвина. Затем первый игрок размещает одного из своих пингвинов на незанятой льдине. После этого второй игрок делает то же самое. После этого они аналогично размещают своих вторых пингвинов.</p>

<p>Как только все пингвины находятся на льдинах, лов рыбы начинается! Игроки ходят по очереди. Ход состоит из перемещения одного из пингвинов текущего игрока, после этого игрок берет льдину --- карточку, на которой его пингвин стоял в начале его хода, и кладет ее перед собой.</p>

<p>Пингвин может двигаться по льдинам любом направлении и остановиться на любой незанятой льдине. При этом запрещено перепрыгивать через других пингвинов и через проруби, оставшиеся после удаления льдин. Если у пингвина с обеих сторон препятствие, то он не может двигаться.</p>

<p>Если игрок не может переместить ни одного из его пингвинов, он забирает всех своих пингвинов и льдины, на которых эти пингвины стояли. После этого второй игрок продолжает делать ходы, пока он может перемещать своих пингвинов.</p>

<p>В конце игры каждый игрок считает количество рыб на всех собранных им карточках. Цель игрока максимизировать разность своего количества рыб и количества рыб противника. Какую максимальную разность может получить первый игрок, при оптимальной игре второго игрока.</p>

### 입력

<p>В первой строке входного файла число $n$ ($4 \le n \le 10$) --- количество карточек. Во второй строке файла находится $n$ чисел $a_i$ --- количество рыб на карточках в порядке в котором они выложены на столе. $1 \le a_i \le 10^6$.</p>

### 출력

<p>В выходной файл выведите одно число: какую максимальную разность может получить первый игрок, при оптимальной игре второго игрока.</p>

### 힌트

<p>Пример игры для теста из условия</p>

<p>В начале игры на поле нет ни одного пингвина:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/29686.%E2%80%85%D0%AD%D0%B9!%E2%80%85%D0%AD%D1%82%D0%BE%E2%80%85%D0%9C%D0%9E%D0%AF%E2%80%85%D1%80%D1%8B%D0%B1%D0%B0!/8aaf2b55.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/29686.%E2%80%85%D0%AD%D0%B9!%E2%80%85%D0%AD%D1%82%D0%BE%E2%80%85%D0%9C%D0%9E%D0%AF%E2%80%85%D1%80%D1%8B%D0%B1%D0%B0!/8aaf2b55.png" data-original-src="https://upload.acmicpc.net/43dd5613-5110-4edb-ad64-78ff14c723a1/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 274px; height: 49px;" /></p>

<p>Первый игрок выставляет первого пингвина:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/29686.%E2%80%85%D0%AD%D0%B9!%E2%80%85%D0%AD%D1%82%D0%BE%E2%80%85%D0%9C%D0%9E%D0%AF%E2%80%85%D1%80%D1%8B%D0%B1%D0%B0!/9be19bbb.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/29686.%E2%80%85%D0%AD%D0%B9!%E2%80%85%D0%AD%D1%82%D0%BE%E2%80%85%D0%9C%D0%9E%D0%AF%E2%80%85%D1%80%D1%8B%D0%B1%D0%B0!/9be19bbb.png" data-original-src="https://upload.acmicpc.net/ef7e3202-6951-479f-911b-ee708991b3d8/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 274px; height: 49px;" /></p>

<p>Второй игрок выставляет первого пингвина:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/29686.%E2%80%85%D0%AD%D0%B9!%E2%80%85%D0%AD%D1%82%D0%BE%E2%80%85%D0%9C%D0%9E%D0%AF%E2%80%85%D1%80%D1%8B%D0%B1%D0%B0!/cbfcacf7.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/29686.%E2%80%85%D0%AD%D0%B9!%E2%80%85%D0%AD%D1%82%D0%BE%E2%80%85%D0%9C%D0%9E%D0%AF%E2%80%85%D1%80%D1%8B%D0%B1%D0%B0!/cbfcacf7.png" data-original-src="https://upload.acmicpc.net/6338902b-3dd8-4f93-b054-a18896f2db80/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 51px; width: 274px;" /></p>

<p>Первый игрок выставляет своего второго пингвина:</p>

<p> </p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/29686.%E2%80%85%D0%AD%D0%B9!%E2%80%85%D0%AD%D1%82%D0%BE%E2%80%85%D0%9C%D0%9E%D0%AF%E2%80%85%D1%80%D1%8B%D0%B1%D0%B0!/aa68b052.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/29686.%E2%80%85%D0%AD%D0%B9!%E2%80%85%D0%AD%D1%82%D0%BE%E2%80%85%D0%9C%D0%9E%D0%AF%E2%80%85%D1%80%D1%8B%D0%B1%D0%B0!/aa68b052.png" data-original-src="https://upload.acmicpc.net/2d9265a0-4405-42e3-b56d-8d804461bacb/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 274px; height: 49px;" /></p>

<p>Второй игрок выставляет своего второго пингвина:</p>

<p> </p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/29686.%E2%80%85%D0%AD%D0%B9!%E2%80%85%D0%AD%D1%82%D0%BE%E2%80%85%D0%9C%D0%9E%D0%AF%E2%80%85%D1%80%D1%8B%D0%B1%D0%B0!/d8d425aa.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/29686.%E2%80%85%D0%AD%D0%B9!%E2%80%85%D0%AD%D1%82%D0%BE%E2%80%85%D0%9C%D0%9E%D0%AF%E2%80%85%D1%80%D1%8B%D0%B1%D0%B0!/d8d425aa.png" data-original-src="https://upload.acmicpc.net/2024b266-6033-4082-b9bd-475c12602f18/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 274px; height: 50px;" /></p>

<p>Ход первого игрока:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/29686.%E2%80%85%D0%AD%D0%B9!%E2%80%85%D0%AD%D1%82%D0%BE%E2%80%85%D0%9C%D0%9E%D0%AF%E2%80%85%D1%80%D1%8B%D0%B1%D0%B0!/dc1b258f.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/29686.%E2%80%85%D0%AD%D0%B9!%E2%80%85%D0%AD%D1%82%D0%BE%E2%80%85%D0%9C%D0%9E%D0%AF%E2%80%85%D1%80%D1%8B%D0%B1%D0%B0!/dc1b258f.png" data-original-src="https://upload.acmicpc.net/d938f406-ab75-4202-8a55-0391a63c5191/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 274px; height: 51px;" /></p>

<p>Ход второго игрока:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/29686.%E2%80%85%D0%AD%D0%B9!%E2%80%85%D0%AD%D1%82%D0%BE%E2%80%85%D0%9C%D0%9E%D0%AF%E2%80%85%D1%80%D1%8B%D0%B1%D0%B0!/c98b5a79.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/29686.%E2%80%85%D0%AD%D0%B9!%E2%80%85%D0%AD%D1%82%D0%BE%E2%80%85%D0%9C%D0%9E%D0%AF%E2%80%85%D1%80%D1%8B%D0%B1%D0%B0!/c98b5a79.png" data-original-src="https://upload.acmicpc.net/edf83be6-bb75-40bc-a7e0-1b83298af87f/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 274px; height: 49px;" /></p>

<p>Ход первого игрока:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/29686.%E2%80%85%D0%AD%D0%B9!%E2%80%85%D0%AD%D1%82%D0%BE%E2%80%85%D0%9C%D0%9E%D0%AF%E2%80%85%D1%80%D1%8B%D0%B1%D0%B0!/92881480.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/29686.%E2%80%85%D0%AD%D0%B9!%E2%80%85%D0%AD%D1%82%D0%BE%E2%80%85%D0%9C%D0%9E%D0%AF%E2%80%85%D1%80%D1%8B%D0%B1%D0%B0!/92881480.png" data-original-src="https://upload.acmicpc.net/3c8e5f8b-b349-4e23-863f-2fe70dd732ba/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 274px; height: 50px;" /></p>