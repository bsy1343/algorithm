# [Silver V] OIJ - 26753

[문제 링크](https://www.acmicpc.net/problem/26753)

### 성능 요약

시간 제한: 6 초, 메모리 제한: 1024 MB

### 통계

제출: 70, 정답: 54, 맞힌 사람: 42, 정답 비율: 79.245%

### 분류

그리디 알고리즘, 문자열

### 문제 설명

<p>Szkoła Bajtka i Bitosi organizuje wielki festyn z okazji rozpoczęcia Olimpiady Informatycznej Junior&oacute;w. W ramach przygotowań, rodzeństwo podjęło się sporządzenia jak największej liczby transparent&oacute;w z napisem <code>oij</code> (w Bajtocji używa się wyłącznie małych liter alfabetu angielskiego).</p>

<p>W piwnicy swojego domu Bajtek i Bitosia znaleźli stary, wielki i bardzo starannie wykonany transparent, pochodzący z czas&oacute;w młodości ich rodzic&oacute;w, zawierający długi napis w dziwnym języku (rodzice nie chcą niestety przyznać się, do czego im służył). Bajtek zauważył, że można spr&oacute;bować zamalować na transparencie niekt&oacute;re znaki tak, aby pozostały tylko trzy literki: <code>o</code>, <code>i</code> oraz <code>j</code>, w tej kolejności. Bitosia jeszcze poprawiła ten plan &ndash; transparent zostanie najpierw pocięty na kilka fragment&oacute;w tak, aby z każdego z nich dało się uzyskać napis <code>oij</code> metodą Bajtka.</p>

<p>Na przykład, transparent głoszący <code>koligacjeomijaj</code> można podzielić na dwa takie kawałki:</p>

<p style="text-align: center;"><code>koligacjeomijaj</code> &rarr; <code>koligacje|omijaj</code> &rarr; <code>▪️o▪️i▪️▪️▪️j▪️|o▪️ij▪️▪️</code>.</p>

<p>Na ile najwięcej fragment&oacute;w można podzielić napis na starym transparencie, aby z każdego dało się uzyskać <code>oij</code>?</p>

### 입력

<p>W pierwszym (jedynym) wierszu wejścia znajduje się napis &ndash; ciąg małych liter alfabetu angielskiego, długości co najmniej 1 i co najwyżej 1 000 000.</p>

### 출력

<p>W pierwszym (jedynym) wierszu wyjścia należy wypisać jedną liczbę całkowitą &ndash; największą liczbę fragment&oacute;w, na jakie można podzielić napis z wejścia.</p>

<p>Jeśli taki podział jest w og&oacute;le niemożliwy, zamiast tego należy wypisać tylko jedno słowo <code>NIE</code>.</p>