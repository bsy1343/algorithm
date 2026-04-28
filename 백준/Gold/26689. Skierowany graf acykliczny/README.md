# [Gold I] Skierowany graf acykliczny - 26689

[문제 링크](https://www.acmicpc.net/problem/26689)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 15, 정답: 10, 맞힌 사람: 8, 정답 비율: 72.727%

### 분류

애드 혹, 해 구성하기

### 문제 설명

<p>Skierowany graf acykliczny (z angielskiego Directed Acyclic Graph, w skr&oacute;cie DAG) to, jak sama nazwa wskazuje, graf skierowany, kt&oacute;ry nie zawiera cykli.</p>

<p>Jeśli w takim grafie wybierzemy dwa wierzchołki, to możemy obliczyć, ile r&oacute;żnych skierowanych ścieżek istnieje pomiędzy tymi wierzchołkami. Uznajemy, że dwie takie ścieżki są r&oacute;żne, jeśli jedna z nich przebiega krawędzią, przez kt&oacute;rą nie przebiega druga.</p>

<p>Twoim zadaniem jest stworzyć skierowany graf acykliczny o n wierzchołkach (ponumerowanych liczbami od 1 do n), w kt&oacute;rym jest dokładnie k ścieżek z wierzchołka 1 do wierzchołka n. Jest jednak kilka haczyk&oacute;w. Tw&oacute;j graf może mieć co najwyżej 100 wierzchołk&oacute;w, z każdego wierzchołka mogą wychodzić co najwyżej dwie krawędzie oraz nie może on zawierać multikrawędzi (tzn. jeśli z jakiegoś wierzchołka wychodzą dwie krawędzie, to muszą one prowadzić do r&oacute;żnych wierzchołk&oacute;w). Da się udowodnić, że dla każdego możliwego k spełniającego ograniczenia podane niżej da się zbudować graf spełniający te warunki.</p>

### 입력

<p>W pierwszym i jedynym wierszu wejścia znajduje się jedna liczba całkowita k (1 &le; k &le; 10<sup>9</sup>).</p>

### 출력

<p>W pierwszym wierszu wyjścia powinna znaleźć się jedna liczba całkowita n (2 &le; n &le; 100) oznaczająca liczbę wierzchołk&oacute;w w Twoim grafie.</p>

<p>W kolejnych n wierszach powinny znaleźć się po dwie liczby całkowite. Liczby w i-tym wierszu mają oznaczać, do kt&oacute;rych wierzchołk&oacute;w prowadzą krawędzie wychodzące z wierzchołka numer i. Dowolna z tych liczb może być r&oacute;wna &minus;1, jeśli chcesz, aby dana krawędź nie istniała. Jeśli obie liczby w jakimś wierszu są r&oacute;żne od &minus;1, to muszą one być r&oacute;żne od siebie.</p>

<p>Jeśli istnieje wiele graf&oacute;w spełniających warunki zadania, to możesz wypisać dowolny z nich. Zwr&oacute;ć uwagę, że nie musisz minimalizować liczby wierzchołk&oacute;w grafu, wystarczy zmieścić się w ograniczeniu na ich liczbę.</p>

### 힌트

<p>Wyjaśnienie przykładu: Poniższy rysunek przedstawia 6-wierzchołkowy graf opisany na wyjściu. Z wierzchołka 1 do wierzchołka 6 prowadzą ścieżki 1 &rarr; 3 &rarr; 2 &rarr; 6, 1 &rarr; 3 &rarr; 6 oraz 1 &rarr; 5 &rarr; 6.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/26689.%E2%80%85Skierowany%E2%80%85graf%E2%80%85acykliczny/37789e00.png" data-original-src="https://upload.acmicpc.net/72adc385-ac54-41a0-aeda-cf7b302619c4/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 150px; height: 93px;" /></p>