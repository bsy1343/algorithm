# [Platinum IV] Cukierki - 26688

[문제 링크](https://www.acmicpc.net/problem/26688)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 8, 정답: 6, 맞힌 사람: 5, 정답 비율: 83.333%

### 분류

수학, 다이나믹 프로그래밍, 정렬

### 문제 설명

<p>Bajtek wybiera się na przyjęcie urodzinowe do Bitka. Wie, że Bitek uwielbia słodycze, chciałby zatem wręczyć mu w prezencie pewną liczbę opakowań z cukierkami. Kupił n opakowań, gdzie i-te z nich zawiera ai cukierk&oacute;w.</p>

<p>Opakowania są jednak dość ciężkie, i Bajtek zastanawia się, czy musi zabrać je wszystkie do Bitka. Postanowił, że wybierze jakiś niepusty podzbi&oacute;r opakowań, zabierze je do Bitka i powie mu &bdquo;Mam tutaj w sumie x cukierk&oacute;w, ile z nich byś chciał?&rdquo;, gdzie x będzie sumaryczną liczbą cukierk&oacute;w w opakowaniach przyniesionych na przyjęcie. Bitek po usłyszeniu pytania zapewne wybierze dowolną liczbę całkowitą y należącą do przedziału [1, x]. Bajtek chciałby, niezależnie od odpowiedzi Bitka, być w stanie wybrać część przyniesionych opakowań (a resztę zostawić sobie) tak, aby sumaryczna liczba cukierk&oacute;w w tych opakowaniach wynosiła dokładnie y. Nie ma tutaj oczywiście mowy o rozrywaniu opakowań &ndash; dawać cukierki bez opakowania byłoby niekulturalne.</p>

<p>Bajtek zastanawia się zatem, ile niepustych podzbior&oacute;w opakowań może zanieść do Bitka, aby być w stanie, niezależnie od wyboru solenizanta, sprezentować mu żądaną liczbę cukierk&oacute;w. Pom&oacute;ż mu i oblicz to za niego! Jako że liczba takich podzbior&oacute;w może być bardzo duża, to wystarczy, że podasz jej resztę z dzielenia przez 10<sup>9</sup> + 7.</p>

### 입력

<p>W pierwszym wierszu wejścia znajduje się jedna liczba całkowita n (1 &le; n &le; 5000) oznaczająca liczbę opakowań z cukierkami, kt&oacute;re ma Bajtek.</p>

<p>W drugim wierszu znajduje się ciąg n liczb całkowitych a<sub>1</sub>, a<sub>2</sub>, . . . , a<sub>n</sub> (1 &le; a<sub>i</sub> &le; 5000) oznaczających liczby cukierk&oacute;w w kolejnych opakowaniach Bajtka.</p>

### 출력

<p>Na wyjściu powinna znaleźć się jedna liczba całkowita, oznaczająca liczbę możliwych podzbior&oacute;w opakowań, kt&oacute;re Bajtek może zanieść do Bitka, podana modulo 10<sup>9</sup> + 7.</p>

### 힌트

<p>Wyjaśnienie przykładu: Bajtek może zabrać do Bitka 8 r&oacute;żnych podzbior&oacute;w opakowań: {5}, {1, 5}, {1, 3, 5}, {1, 4, 5}, {1, 3, 4, 5}, {1, 2, 3, 5}, {1, 2, 4, 5} i {1, 2, 3, 4, 5}. Gdy zdecyduje się np. zabrać pierwsze, drugie, czwarte i piąte opakowanie, a Bitek zażyczy sobie 9 cukierk&oacute;w, to może wręczyć mu jedynie pierwsze i drugie opakowanie. Bajtek nie może się zdecydować np. na zabranie tylko pierwszego, drugiego i piątego opakowania, gdyż Bitek m&oacute;głby zażyczyć sobie np. 6 cukierk&oacute;w, przez co Bajtek byłby bezradny.</p>