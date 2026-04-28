# [Silver IV] Śpiew - 8575

[문제 링크](https://www.acmicpc.net/problem/8575)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 113, 정답: 58, 맞힌 사람: 43, 정답 비율: 47.778%

### 분류

수학, 그리디 알고리즘

### 문제 설명

<p>Na lekcji śpiewu uczniowie Bajtazara siedzą w jednym, długim rzędzie. Nie wszystkie krzesła są w nim zapełnione i pomiędzy poszczeg&oacute;lnymi uczniami mogą występować wolne miejsca.</p>

<p>Na lekcji uczniowie potrzebują śpiewnik&oacute;w, ale nie każdy musi trzymać śpiewnik. Nauczyciel musi się zatroszczyć tylko o to, aby każdy uczeń bez śpiewnika siedział bezpośrednio obok ucznia ze śpiewnikiem. Ponieważ uczniowie na każdej lekcji siadają w inny spos&oacute;b a śpiewnik&oacute;w jest dosyć mało, Bajtazar poprosił Ciebie, swojego przyjaciela, o napisanie programu, kt&oacute;ry dla danego rozmieszczenia uczni&oacute;w wyznaczy minimalną liczbę potrzebnych im śpiewnik&oacute;w, aby ułatwić Bajtazarowi rozdawanie śpiewnik&oacute;w.</p>

### 입력

<p>W pierwszym wierszu standardowego wejścia znajduje się jedna liczba naturalna $n$&nbsp;($1 &le; n &le; 1\,000\,000$) oznaczająca liczbę miejsc w rzędzie. W drugim wierszu znajduje się ciąg $n$&nbsp;znak&oacute;w opisujących kolejne miejsca:</p>

<ul>
	<li>znak &quot;<code>W</code>&quot; oznacza miejsce wolne,</li>
	<li>znak &quot;<code>Z</code>&quot; oznacza miejsce zajęte przez ucznia.</li>
</ul>

### 출력

<p>Tw&oacute;j program powinien wypisać na wyjście jedną liczbę całkowitą oznaczającą minimalną liczbę śpiewnik&oacute;w, kt&oacute;re można rozdać uczniom tak, aby każdy miał śpiewnik lub siedział obok kogoś ze śpiewnikiem.</p>