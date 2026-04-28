# [Silver III] Program - 8594

[문제 링크](https://www.acmicpc.net/problem/8594)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 72, 정답: 44, 맞힌 사람: 34, 정답 비율: 58.621%

### 분류

자료 구조, 스택

### 문제 설명

<p>Bajtocki kontrwywiad od dawna usiłuje przechwycić program służący pewnemu wrogiemu państwu do szyfrowania wiadomości. Właśnie udało mu się zdobyć pewną część tego programu - sekwencję wszystkich pojawiających się w nim nawias&oacute;w.</p>

<p>W treści programu pojawiają się trzy rodzaje nawias&oacute;w:</p>

<ul>
	<li>okrągłe:&nbsp;<code>(</code>&nbsp;i&nbsp;<code>)</code></li>
	<li>kwadratowe:&nbsp;<code>[</code>&nbsp;i&nbsp;<code>]</code></li>
	<li>klamrowe:&nbsp;<code>{</code>&nbsp;i&nbsp;<code>}</code></li>
</ul>

<p>Jakkolwiek jest to niewielka ilość informacji, bajtoccy agenci chcą wywnioskować z niej możliwie najwięcej. Najważniejszym parametrem danej sekwencji jest&nbsp;<i>stopień zagnieżdżenia nawias&oacute;w</i>. Przez stopień zagnieżdżenia sekwencji nawias&oacute;w rozumiemy maksymalny ciąg par nawias&oacute;w, z kt&oacute;rych każda znajduje się wewnątrz poprzedniej. Wyznaczenie stopnia zagnieżdżenia sprawiło jednak ogromną trudność bajtockim programistom, dlatego kontrwywiad zlecił to zadanie właśnie Tobie.</p>

<p>Bajtoccy agenci uprzedzili Cię, że kosztowny proces obliczania stopnia zagnieżdżenia ma sens tylko wtedy, gdy przechwycony ciąg nawias&oacute;w jest poprawny, czyli wtedy, gdy nawias otwierający każdego rodzaju można sparować z nawiasem zamykającym tego samego rodzaju, występującym dalej, tak aby ciąg nawias&oacute;w znajdujących się pomiędzy nimi r&oacute;wnież był poprawnym ciągiem nawiasowym.</p>

### 입력

<p>Pierwszy wiersz standardowego wejścia zawiera dokładnie jedną liczbę całkowitą $n$&nbsp;($1 &le; n &le; 1\,000\,000$) - jest to długość programu wroga. Drugi wiersz zawiera słowo składające się ze znak&oacute;w: &quot;<code>(</code>&quot;, &quot;<code>)</code>&quot;, &quot;<code>[</code>&quot;, &quot;<code>]</code>&quot;, &quot;<code>{</code>&quot;, &quot;<code>}</code>&quot;. Są to kolejne nawiasy pojawiające się w programie wroga.</p>

### 출력

<p>Jeżeli słowo nawiasowe wczytane na wejściu jest poprawne, Tw&oacute;j program powinien wypisać na standardowe wyjście jedną liczbę całkowitą r&oacute;wną maksymalnemu poziomowi zagnieżdżenia nawias&oacute;w.</p>

<p>W przeciwnym wypadku należy wypisać jedno słowo&nbsp;<code>NIE</code>.</p>