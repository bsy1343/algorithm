# [Bronze I] Koszulki - 26693

[문제 링크](https://www.acmicpc.net/problem/26693)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 82, 정답: 63, 맞힌 사람: 54, 정답 비율: 80.597%

### 분류

구현, 정렬

### 문제 설명

<p>Gotowi na walkę o koszulki Potyczek Algorytmicznych 2021? Zazwyczaj rozdajemy je uczestnikom, kt&oacute;rzy uplasowali się na miejscach od 1 do 256 w rankingu dywizji B+C, w kt&oacute;rym zawodnik&oacute;w por&oacute;wnujemy, przede wszystkim patrząc na sumę punkt&oacute;w zdobytych za zadania z dywizji B oraz dywizji C, a przy remisie bierzemy pod uwagę r&oacute;wnież dokładny rozkład punkt&oacute;w za poszczeg&oacute;lne zadania.</p>

<p>Czasem jesteśmy w stanie zrobić wyjątek i rozdać nawet więcej niż 256 koszulek, gdyż chcielibyśmy spełnić dodatkowy warunek m&oacute;wiący, że jeśli uczestnik A zdobył co najmniej tyle punkt&oacute;w co uczestnik B i uczestnik B otrzyma koszulkę, to uczestnik A r&oacute;wnież ją dostanie, bez względu na dokładny rozkład punkt&oacute;w.</p>

<p>W praktyce nie zawsze można spełnić wspomniany dodatkowy warunek, gdyż mogłoby to oznaczać, że musielibyśmy rozdać o wiele więcej koszulek niż planowaliśmy. Jest to jeden z powod&oacute;w, dla kt&oacute;rego zachęcamy zawodnik&oacute;w, by starali się zdobywać punkty, gdzie tylko się da, wysyłając r&oacute;wnież rozwiązania o nieoptymalnej złożoności czasowej (kt&oacute;re często mogą liczyć na częściową liczbę punkt&oacute;w, nawet jeśli nie zaznaczono tego wyraźnie w treści). Wygładza to ranking oraz uszczęśliwia wszystkich zainteresowanych (a szczeg&oacute;lnie organizator&oacute;w).</p>

<p>Gdyby w Potyczkach wzięło udział n uczestnik&oacute;w, organizatorzy chcieliby rozdać co najmniej k koszulek, a uczestnicy zdobyliby kolejno a<sub>1</sub>, a<sub>2</sub>, a<sub>3</sub>, . . . , a<sub>n</sub> punkt&oacute;w, to ile koszulek musieliby co najmniej rozdać organizatorzy, aby spełnić r&oacute;wnież dodatkowy warunek?</p>

### 입력

<p>W pierwszym wierszu wejścia znajdują się dwie liczby całkowite n i k (1 &le; k &le; n &le; 2000), oznaczające odpowiednio liczbę uczestnik&oacute;w oraz minimalną liczbę koszulek, kt&oacute;re chcą rozdać organizatorzy.</p>

<p>Drugi wiersz zawiera ciąg n liczb całkowitych a<sub>1</sub>, a<sub>2</sub>, a<sub>3</sub>, . . . , a<sub>n</sub> (1 &le; a<sub>i</sub> &le; 120), gdzie ai oznacza liczbę punkt&oacute;w zdobytych przez i-tego zawodnika.</p>

### 출력

<p>Na wyjściu powinna znaleźć się jedna liczba całkowita, oznaczająca minimalną liczbę koszulek, kt&oacute;re muszą rozdać organizatorzy, aby spełnić dodatkowy warunek.</p>

### 힌트

<p>Wyjaśnienie przykładu: Organizatorzy nie mogliby rozdać dokładnie trzech koszulek, dając je na przykład uczestnikom o numerach 2, 3 i 4, gdyż wtedy pokrzywdzony byłby pierwszy uczestnik (bo zdobył nie mniej punkt&oacute;w niż czwarty uczestnik, a w przeciwieństwie do niego nie otrzymał koszulki, więc nie byłby spełniony dodatkowy warunek). Rozwiązaniem jest wręczyć koszulki wszystkim zawodnikom poza ostatnim.</p>