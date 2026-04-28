# [Silver III] Gra - 8689

[문제 링크](https://www.acmicpc.net/problem/8689)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 112, 정답: 45, 맞힌 사람: 34, 정답 비율: 36.559%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Kolejny deszczowy dzień. Paweł i Gaweł zn&oacute;w byli zmuszeni do pozostania w domu. W związku z brakiem zajęć postanowili wymyślić jakąś grę.</p>

<p>Paweł wpadł na genialny pomysł. Na kartce papieru narysował <em>n</em>&nbsp;p&oacute;l. Na każdym polu znajdowały się dwie liczby - pierwsza z nich była numerem pola (liczba naturalna od 1&nbsp;do&nbsp;<em>n</em>, pola miały parami r&oacute;żne numery), a druga jego wartością (liczba całkowita od -1 000&nbsp;do 1 000). Na polu numer 1&nbsp;umieścił pionek. Zadaniem gracza było wykonywanie kolejnych ruch&oacute;w, polegających na rzucie sześcienna kostką (z numerami od 1&nbsp;do 6&nbsp;napisanymi na ściankach) oraz przesuwaniu pionka o wskazaną liczbę oczek. Gra kończyła się, kiedy pionek stanął na pole o numerze <em>n</em>. Wynikiem, jaki uzyskał gracz, była suma wartości p&oacute;l na jakich stał pionek.</p>

<p>Po rozegraniu kilku partii Paweł i Gaweł otrzymali kilka r&oacute;żnych wynik&oacute;w, jednak nie wiedzieli czy kt&oacute;ryś z nich był największym możliwym do uzyskania. Zadzwonili więc do Ciebie, utalentowanego informatyka, abyś napisał program, kt&oacute;ry dla danej planszy obliczy maksymalny możliwy do uzyskania wynik.</p>

### 입력

<p>Pierwszy wiersz standardowego wejścia zawiera jedną liczbę całkowitą <em>n</em>&nbsp;(1 &le; <em>n</em> &le; 10<sup>6</sup>) oznaczającą liczbę p&oacute;l na planszy. Drugi wiersz zawiera&nbsp;<em>n</em>&nbsp;liczb całkowitych <em>w</em><sub>1</sub>,&nbsp;<em>w</em><sub>2</sub>, ...,&nbsp;<em>w<sub>i</sub></em>&nbsp;(-1 000 &le; <em>w<sub>i</sub></em> &le; 1 000), gdzie&nbsp;<em>w<sub>i</sub></em>&nbsp;oznacza wartość <em>i</em>-tego pola.</p>

### 출력

<p>Pierwszy i jedyny wiersz standardowego wyjścia powinien zawierać jedną liczbę całkowitą, oznaczającą maksymalny możliwy do uzyskania wynik na danej planszy.</p>