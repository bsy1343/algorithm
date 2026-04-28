# [Bronze III] Wybór zadań - 26676

[문제 링크](https://www.acmicpc.net/problem/26676)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 226, 정답: 176, 맞힌 사람: 156, 정답 비율: 81.250%

### 분류

구현, 문자열

### 문제 설명

<p>Przygotowanie rund zdalnych Potyczek Algorytmicznych jest dla Mateusza nie lada wyzwaniem. Podczas konkursu uczestnicy biorą udział w pięciu rundach, numerowanych liczbami od 1 do 5, a w każdej rundzie rozwiązują zadania z trzech dywizji, zwanych A, B i C. Podczas każdej z pierwszych czterech rund w każdej dywizji pojawia się jedno zadanie, a podczas ostatniej, piątej rundy w każdej dywizji pojawiają się po dwa zadania. Należy więc wymyślić i przygotować aż osiemnaście zadań i przypisać je do piętnastu r&oacute;żnych pozycji, przy czym do trzech pozycji (5A, 5B i 5C) trzeba przypisać po dwa zadania. Przez pozycję rozumiemy tu kombinację numeru rundy oraz nazwy dywizji.</p>

<p>Mateusz jest świadomy, że nie można tak po prostu użyć osiemnastu dowolnych zadań. Ich trudność powinna pasować do rundy oraz do dywizji, w kt&oacute;rej się pojawią. Chłopak przez cały rok zebrał n pomysł&oacute;w na zadania. Dla każdego z nich wie, na kt&oacute;rą pozycję pasowałoby to zadanie (przy czym nie pasowałoby na żadną inną pozycję).</p>

<p>Mateusz zastanawia się więc, czy możliwe jest wybranie osiemnastu spośr&oacute;d jego pomysł&oacute;w i przypisanie ich do pozycji w poprawny spos&oacute;b. Mając dostęp do jego notatek, pom&oacute;ż mu to stwierdzić!</p>

### 입력

<p>W pierwszym wierszu wejścia znajduje się jedna liczba całkowita n (1 &le; n &le; 100), oznaczająca liczbę pomysł&oacute;w Mateusza.</p>

<p>W drugim wierszu znajduje się n sł&oacute;w oznaczających pozycje, na kt&oacute;re pasują kolejne zadania Mateusza. Każde z tych sł&oacute;w składa się z dokładnie dw&oacute;ch znak&oacute;w i jako pierwszy znak zawiera cyfrę ze zbioru {1, 2, 3, 4, 5}, a jako drugi literę ze zbioru {A, B, C}.</p>

### 출력

<p>Na wyjściu powinno znaleźć się jedno słowo <code>TAK</code> lub <code>NIE</code>, oznaczające czy z pomysł&oacute;w Mateusza można ułożyć poprawny zestaw zadań na rundy zdalne Potyczek Algorytmicznych.</p>

### 힌트

<p>Wyjaśnienie przykładu: W pierwszym teście przykładowym Mateusz ma trzy pomysły na zadania pasujące na pozycję 5C. Po odrzuceniu dowolnego z nich reszta pomysł&oacute;w tworzy poprawny zestaw zadań. W drugim teście przykładowym Mateusz dysponuje tylko jednym zadaniem pasującym do pozycji 5B, nie może zatem ułożyć poprawnego zestawu zadań.</p>