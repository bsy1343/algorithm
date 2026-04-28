# [Gold III] Jednoręki bandyta - 8644

[문제 링크](https://www.acmicpc.net/problem/8644)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 12, 정답: 4, 맞힌 사람: 4, 정답 비율: 36.364%

### 분류

구현, 자료 구조, 집합과 맵

### 문제 설명

<p>Bajtek przyszedł do kasyna, gdzie od razu zainteresował go automat do gry w jednorękiego bandytę. Najważniejszą częścią automatu są trzy bębny. Każdy z nich podzielony jest na&nbsp;<em>n</em>&nbsp;r&oacute;wnych p&oacute;l, na kt&oacute;rych namalowane są r&oacute;żne symbole. Jest&nbsp;<em>n</em>&nbsp;możliwych symboli i każdy z nich występuje na każdym bębnie dokładnie raz. Dla uproszczenia ponumerujmy symbole liczbami od 1 do&nbsp;<em>n</em>. Poniższy rysunek przedstawia przykładowy automat z trzema bębnami podzielonymi na <em>n</em> = 5&nbsp;p&oacute;l:</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/57259e56-084f-42a8-b15c-a557c2f93fd7/-/preview/" style="width: 84px; height: 100px;" /></p>

<p>Po pociągnięciu wajchy, każdy z bębn&oacute;w przesuwa się cyklicznie o pewną liczbę pozycji. Wygrana gracza zależy od liczby poziomych rzęd&oacute;w, w kt&oacute;rych znajdą się trzy takie same symbole.</p>

<p>Bajtek wie, że jednoręki bandyta może zabrać wszystkie jego pieniądze, więc wolałby najpierw stwierdzić, jaka może być jego maksymalna wygrana. Pom&oacute;ż mu i wyznacz liczbę rzęd&oacute;w, w kt&oacute;rych mogą znaleźć się trzy takie same symbole przy najkorzystniejszym ustawieniu bębn&oacute;w.</p>

### 입력

<p>Pierwszy wiersz wejścia zawiera jedną liczbę całkowitą <em>n</em>&nbsp;(1 &le;&nbsp;<em>n</em> &le; 300 000), oznaczającą wielkość bębn&oacute;w. Trzy następne wiersze opisują układy symboli na poszczeg&oacute;lnych bębnach.</p>

<p>Opis bębna składa się z&nbsp;<em>n</em>&nbsp;parami r&oacute;żnych liczb całkowitych <em>a</em><sub>1</sub>, <em>a</em><sub>2</sub>, ..., <em>a<sub>n</sub></em> (1 &le; <em>a<sub>i</sub></em> &le; <em>n</em>), gdzie <em>a<sub>i</sub></em>&nbsp;oznacza symbol znajdujący się na pozycji <em>i</em>.</p>

### 출력

<p>Pierwszy i jedyny wiersz wyjścia powinien zawierać jedną liczbę całkowitą, r&oacute;wną maksymalnej liczbie rzęd&oacute;w, w kt&oacute;rych mogą się jednocześnie znaleźć po trzy takie same symbole.</p>

### 힌트

<p>Rysunek do testu przykładowego znajduje się w treści zadania. Bęben 1 możemy przekręcić o trzy pozycje do g&oacute;ry, bęben 2 o jedną pozycję do g&oacute;ry, a bęben 3 o jedną pozycję w d&oacute;ł.</p>