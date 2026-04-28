# [Gold II] Słowo - 17768

[문제 링크](https://www.acmicpc.net/problem/17768)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 87, 정답: 17, 맞힌 사람: 11, 정답 비율: 16.667%

### 분류

해 구성하기, 다이나믹 프로그래밍, 수학, 문자열

### 문제 설명

<p>Zadanie polega na znalezieniu k-tego (w porządku leksykograficznym) spośr&oacute;d niepustych sł&oacute;w składających się z co najwyżej n liter ze zbioru {a, b, c} i takich, że każde dwie sąsiadujące litery w tym słowie są r&oacute;żne.</p>

<p>Przypomnijmy, że słowo s jest mniejsze od słowa t (s 6= t) w porządku leksykograficznym jeśli s jest prefiksem t lub jeśli na pierwszej pozycji, na kt&oacute;rej słowa s i t się r&oacute;żnią, w słowie s znajduje się mniejsza (w porządku alfabetycznym) litera niż w słowie t.</p>

### 입력

<p>Jedyny wiersz wejścia zawiera dwie liczby całkowite n i k (1 &le; n &le; 10<sup>6</sup>, 1 &le; k &le; 10<sup>18</sup>) z treści zadania.</p>

### 출력

<p>Jeśli istnieje mniej niż k sł&oacute;w spełniających warunki zadania, na wyjście należy wypisać <code>NIE</code>. W przeciwnym razie w jedynym wierszu wyjścia powinno znaleźć się szukane słowo.</p>