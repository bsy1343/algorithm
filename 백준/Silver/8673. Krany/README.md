# [Silver III] Krany - 8673

[문제 링크](https://www.acmicpc.net/problem/8673)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 98, 정답: 32, 맞힌 사람: 31, 정답 비율: 32.979%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>W pewnym zakładzie przemysłowym znajduje się <em>n</em>&nbsp;kran&oacute;w, z kt&oacute;rych może lać się woda. Przy każdym kranie znajduje się wskaźnik, oznaczający temperaturę wody, dla danego kranu. Woda leje się z kranu, jeśli ustawiona temperatura wody jest większa od zera. Woda z każdego kranu leje się z r&oacute;wną prędkością i trafia do wsp&oacute;lnego zbiornika.</p>

<p>Znając temperatury przy każdym kranie, chcielibyśmy wiedzieć, ile minimalnie kran&oacute;w musimy zakręcić, aby temperatura wody w zbiorniku była r&oacute;wna lub większa od wartości <em>w</em>.</p>

<p>Zakładamy, że temperatura w zbiorniku jest średnią temperaturą wszystkich kran&oacute;w, z kt&oacute;rych leci woda. Temperatura się nie zmienia na skutek oddziaływania temperatury powietrza.</p>

### 입력

<p>Pierwszy wiersz standardowego wejścia zawiera dwie liczby całkowite <em>n</em>, <em>w</em>&nbsp;(1 &le; i &le; 10<sup>6</sup>, 1 &le; <em>w</em> &le; 100), oznaczające odpowiednio liczbę kran&oacute;w oraz wartość temperatury, kt&oacute;rą chcemy uzyskać. W kolejnym wierszu znajduje się <em>n</em>&nbsp;liczb całkowitych <em>t</em><sub>1</sub>, <em>t</em><sub>2</sub>, ..., <em>t<sub>n</sub></em>&nbsp;(-100 &le; <em>t<sub>i</sub></em> &le; 100), gdzie&nbsp;<em>t<sub>i</sub></em>&nbsp;oznacza temperaturę wody, ustawioną dla <em>i</em>-tego kranu.</p>

### 출력

<p>W pierwszym i jedynym wierszu wyjścia powinna znajdować się jedna liczba całkowita, r&oacute;wna minimalnej liczbie kran&oacute;w, jakie powinniśmy zakręcić, aby temperatura w zbiorniku wynosiła co najmniej <em>w</em>&nbsp;stopni lub jedno słowo &#39;NIE&#39;, jeśli nie jest możliwe uzyskanie takiej temperatury.</p>

### 힌트

<p>Można zakręcić dwa pierwsze krany o temperaturach 1&nbsp;i 2.</p>