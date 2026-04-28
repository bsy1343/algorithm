# [Platinum I] Malowanie - 8250

[문제 링크](https://www.acmicpc.net/problem/8250)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 36, 정답: 9, 맞힌 사람: 7, 정답 비율: 33.333%

### 분류

값 / 좌표 압축, 자료 구조, 분할 정복, 포함 배제의 원리, 누적 합, 세그먼트 트리, 스위핑

### 문제 설명

<p>Nadszedł czas, by znowu pomalować mieszkanie. Bajtazar nie przepada za malowaniem, jednak zauważył, że pojemniki z farbą i pędzle wzbudziły żywe zainteresowanie wśr&oacute;d jego dzieci. Rozdał więc pędzle dzieciom i poprosił je o pomalowanie jednej ze ścian. Każde z dzieci pomalowało fragment w kształcie prostokąta o bokach r&oacute;wnoległych lub prostopadłych do podłogi.</p>

<p>Niestety okazało się, że farba zakupiona przez Bajtazara nie jest najlepszej jakości, przez co dobrze wyglądają teraz jedynie te fragmenty ściany, kt&oacute;re zostały pominięte przez co najwyżej jedno dziecko. Jaka jest łączna powierzchnia tych fragment&oacute;w?</p>

### 입력

<p>W pierwszym wierszu wejścia znajduje się liczba całkowita <em>n</em>&nbsp;(2 &le; <em>n</em> &le; 500 000), oznaczająca liczbę dzieci Bajtazara.</p>

<p>Każdy z kolejnych&nbsp;<em>n</em>&nbsp;wierszy opisuje obszar zamalowany przez jedno dziecko. W <em>i</em>-tym spośr&oacute;d tych wierszy znajdują się cztery liczby całkowite <em>x</em><sub>1</sub>, <em>y</em><sub>1</sub>, <em>x</em><sub>2</sub>, <em>y</em><sub>2</sub>&nbsp;(0 &le; <em>x</em><sub>1</sub> &lt; <em>x</em><sub>2</sub> &le; 10<sup>9</sup>, 0 &le; <em>y</em><sub>1</sub> &lt; <em>y</em><sub>2</sub> &le; 10<sup>9</sup>). Oznaczają one, że <em>i</em>-te dziecko pomalowało obszar będący prostokątem, kt&oacute;rego lewy dolny wierzchołek leży w punkcie (<em>x</em><sub>1</sub>, <em>y</em><sub>1</sub>), prawy g&oacute;rny wierzchołek leży w punkcie (<em>x</em><sub>2</sub>, <em>y</em><sub>2</sub>), a boki są r&oacute;wnoległe do osi układu wsp&oacute;łrzędnych.</p>

### 출력

<p>Tw&oacute;j program powinien wypisać na wyjście jedną liczbę całkowitą - powierzchnię tej części ściany, kt&oacute;ra nie wymaga dalszego malowania, to znaczy została pomalowana przez co najmniej <em>n</em> - 1&nbsp;dzieci.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/8250.%E2%80%85Malowanie/9305d776.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/8250.%E2%80%85Malowanie/9305d776.png" data-original-src="https://upload.acmicpc.net/b29fb276-f369-4219-bfaf-d6a2dc55f210/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 150px; height: 129px;" /></p>

<p>Do wyniku wliczają się obszary zamalowane na rysunku ciemniejszym i najciemniejszym kolorem.</p>