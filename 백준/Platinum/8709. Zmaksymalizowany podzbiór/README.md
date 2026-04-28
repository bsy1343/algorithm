# [Platinum V] Zmaksymalizowany podzbiór - 8709

[문제 링크](https://www.acmicpc.net/problem/8709)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 5, 정답: 3, 맞힌 사람: 2, 정답 비율: 66.667%

### 분류

자료 구조, 그리디 알고리즘, 정렬, 집합과 맵, 우선순위 큐, 트리를 사용한 집합과 맵, 스택

### 문제 설명

<p>Niech <em>f</em>(<em>A</em>)&nbsp;będzie funkcją, kt&oacute;ra dla podanego multizbioru <em>A</em>&nbsp;(czyli zbioru, w kt&oacute;rym elementy mogą się powtarzać) zwraca taką liczbę <em>x</em>, że każdą z liczb od 1&nbsp;do&nbsp;<em>x</em>&nbsp;można przedstawić jako sumę element&oacute;w pewnego podzbioru&nbsp;<em>A</em>&nbsp;(w tym zadaniu zakładamy, że podzbi&oacute;r multizbioru też jest multizbiorem), natomiast liczby <em>x</em> + 1&nbsp;już jako sumy element&oacute;w pewnego podzbioru&nbsp;<em>A</em>&nbsp;przedstawić się nie da.</p>

<p>Mając podany pewien <em>n</em>-elementowy multizbi&oacute;r <em>A</em>, Twoim zadaniem jest znalezienie <em>k</em>-elementowego podzbioru <em>B</em>, takiego że wartość <em>f</em>(<em>B</em>)&nbsp;jest największa z możliwych.</p>

### 입력

<p>W pierwszej linii wejścia znajduje się jedna liczba całkowita <em>t</em>&nbsp;(1 &le; <em>t</em> &le; 100), oznaczająca liczbę zestaw&oacute;w danych. Opis każdego zestawu danych składa sie z dw&oacute;ch wierszy. W pierwszej linii każdego zestawu danych znajdują się dwie liczby całkowite <em>n</em>&nbsp;oraz <em>k</em>&nbsp;(1 &le; <em>k</em> &le; <em>n</em> &le; 10<sup>5</sup>). W kolejnym wierszu znajduje się <em>n</em>&nbsp;liczb całkowitych <em>a</em><sub>1</sub>, <em>a</em><sub>2</sub>, ..., <em>a<sub>n</sub></em>&nbsp;(1 &le; <em>a<sub>i</sub></em> &le; 10<sup>9</sup>), oddzielonych pojedynczą spacją, oznaczających elementy <em>A</em>.</p>

<p>Zakładamy, że suma <em>n</em>&nbsp;we wszystkich zestawach danych nie przekroczy 10<sup>6</sup>.</p>

### 출력

<p>Na wyjściu dla każdego zestawu danych powinna znaleźć się w oddzielnej linii jedna liczba całkowita, oznaczająca maksymalną możliwą wartość <em>f</em>(<em>B</em>).</p>