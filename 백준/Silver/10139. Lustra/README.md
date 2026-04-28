# [Silver IV] Lustra - 10139

[문제 링크](https://www.acmicpc.net/problem/10139)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 58, 정답: 37, 맞힌 사람: 32, 정답 비율: 68.085%

### 분류

구현, 정렬, 애드 혹

### 문제 설명

<p>Firma Bajtazara zajmuje się produkcją drewnianych szaf z lustrzanymi drzwiami. Firma koncentruje się na jakości wyrob&oacute;w z drewna, a produkcję luster zleca podwykonawcom.</p>

<p>Właśnie zakończył się jeden z przetarg&oacute;w zorganizowanych przez firmę Bajtazara. Wzięło w nim udział <em>n</em>&nbsp;zakład&oacute;w, z kt&oacute;rych każdy złożył pewną ofertę rozmiar&oacute;w produkowanych luster. Wszystkie lustra mają prostokątny kształt. Oferta każdego z zakład&oacute;w przedstawia minimalną i maksymalną szerokość oraz minimalną i maksymalną wysokość produkowanych luster. Przy produkcji szaf luster nie można obracać.</p>

<p>Bajtazar wie, że jeśli do przetargu stanął zakład, kt&oacute;rego oferta majoryzuje oferty wszystkich pozostałych, tzn. żaden inny oferent nie ma w ofercie rozmiaru luster, kt&oacute;rego nie produkowałby &oacute;w zakład, to taki zakład z pewnością wygra przetarg (jeśli w przetargu wystąpi wiele zakład&oacute;w o majoryzującej ofercie, wygra ten, kt&oacute;ry zaproponuje najniższą cenę centymetra kwadratowego lustra). W przeciwnym razie ocena ofert będzie skomplikowana, a rozstrzygnięcie przetargu znacząco się op&oacute;źni. Licząc na uniknięcie jałowych dyskusji, Bajtazar poprosił Cię o napisanie programu, kt&oacute;ry stwierdzi, czy oferta kt&oacute;regoś z zakład&oacute;w majoryzuje oferty pozostałych zakład&oacute;w.</p>

### 입력

<p>Pierwszy wiersz wejścia zawiera jedną liczbę całkowitą <em>t</em>&nbsp;(1 &le; <em>t</em> &le; 10), oznaczającą liczbę przypadk&oacute;w testowych do rozważenia. Dalej następują opisy kolejnych przypadk&oacute;w testowych.</p>

<p>Pierwszy wiersz opisu zawiera jedną liczbę całkowitą <em>n</em>&nbsp;(2 &le; <em>n</em> &le; 100 000), oznaczającą liczbę zakład&oacute;w produkcji luster, kt&oacute;re złożyły oferty w przetargu organizowanym przez firmę Bajtazara. Każdy z kolejnych <em>n</em>&nbsp;wierszy zawiera po cztery liczby całkowite <em>w<sub>1</sub></em>, <em>w<sub>2</sub></em>, <em>h<sub>1</sub></em>, <em>h<sub>2</sub></em>&nbsp;(1 &le; <em>w<sub>1</sub></em> &le; <em>w<sub>2</sub></em> &le; 10<sup>9</sup>, 1 &le; <em>h<sub>1</sub></em> &le; <em>h<sub>2</sub></em> &le; 10<sup>9</sup>). Liczby te oznaczają, że dany zakład może wyprodukować lustra o dowolnej całkowitej szerokości <em>w</em>&nbsp;i wysokości <em>h</em>&nbsp;spełniających <em>w<sub>1</sub></em> &le; <em>w</em> &le; <em>w<sub>2</sub></em>&nbsp;oraz <em>h<sub>1</sub></em> &le; <em>h</em> &le; <em>h<sub>2</sub></em>.</p>

### 출력

<p>Tw&oacute;j program powinien wypisać na wyjście dokładnie <em>t</em>&nbsp;wierszy, zawierających odpowiedzi dla poszczeg&oacute;lnych zestaw&oacute;w testowych. W <em>i</em>-tym z tych wierszy powinno znaleźć się jedno słowo&nbsp;<code>TAK</code>&nbsp;lub&nbsp;<code>NIE</code>, w zależności od tego, czy w przetargu wziął udział zakład, kt&oacute;rego oferta majoryzuje oferty wszystkich pozostałych oferent&oacute;w.</p>