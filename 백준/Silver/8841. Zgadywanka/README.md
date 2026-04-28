# [Silver III] Zgadywanka - 8841

[문제 링크](https://www.acmicpc.net/problem/8841)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 47, 정답: 30, 맞힌 사람: 26, 정답 비율: 78.788%

### 분류

수학

### 문제 설명

<p>Hektor lubi opiekować się swoją młodszą siostrą Kornelią - nigdy nie brakuje im pomysł&oacute;w na zabawy. Dzisiaj grają w zgadywankę.</p>

<p>Do zabawy potrzebne jest N kwadratowych p&oacute;l, ułożonych jedno za drugim. Na początku Kornelia zamalowuje kilka początkowych p&oacute;l (na przykład pierwsze 5, pierwsze 2 - oczywiście może zamalować wszystkie pola, albo żadne z nich). Kiedy Kornelia skończy zamalowywać pola, przykrywa każde z nich kawałkiem papieru, tak, że nie widać czy zostało zamalowane.</p>

<p>Wtedy przychodzi kolej na Hektora - jego zadaniem jest dowiedzieć się, ile p&oacute;l zamalowała Kornelia. Hektor może odkrywać wybrane przez siebie pola w kolejnych rundach zgadywanki. W każdej z nich może odkryć (jednocześnie!) co najwyżej K do tej pory zakrytych p&oacute;l.</p>

<p>Oblicz minimalną liczbę rund, dla kt&oacute;rej istnieje spos&oacute;b wybierania odkrywanych p&oacute;l dający gwarancję ustalenia liczby zamalowanych kwadrat&oacute;w.&nbsp;</p>

### 입력

<p>W pierwszej linii wejścia znajduje się liczba zestaw&oacute;w testowych Z ( 1 &lt;= Z &lt;= 10 ). W kolejnych Z liniach znajdują się po dwie, opisane w treści liczby naturalne N &nbsp;i K ( 1 &lt;= N, K &lt;= 1000000 ).</p>

### 출력

<p>Dla każdego zestawu testowego należy w osobnej lini wypisać opisaną w treści minimalną liczbę rund dającą gwarancję sukcesu.</p>

### 힌트

<p>2 rundy wystarczają do ustalenia liczby zamalowanych p&oacute;l przy następującej strategii odkrywania p&oacute;l. Hektor w pierwszej rundzie odkrywa pola 2 i 4.&nbsp;</p>

<ul>
	<li>jeśli pola 2 i 4 okażą się zamalowane, wystarczy w drugiej rundzie odkryć pole nr 5 aby przekonać się czy Kornelia zamalowała 4 czy 5 p&oacute;l</li>
	<li>jeśli pole 2 okaże się zamalowane, a 4 nie, wystarczy w drugiej rundzie odkryć pole nr 3 aby przekonać się czy Kornelia zamalowała 2 czy 3 pola</li>
	<li>jeśli ani pole 2 ani pole 3 nie będzie zamalowane, wystarczy w drugiej rundzie odkryć pole nr 1 aby przekonać się czy Kornelia zamalowała 1 pole, czy nie zamalowała żadnego.</li>
</ul>

<p>Jednocześnie 1 runda to za mało - niezależnie od tego jakie pola Hektor odkryje w pierwszej rundzie, może się okazać, że w dalszym ciągu nie wie ile p&oacute;l zamalowała Kornelia. Wybrane przykłady:</p>

<ul>
	<li>jeśli Hektor odkryje pola 2 i 4, pole 2 może okazać się zamalowane, a 4 nie - Hektor nie wie, czy Kornelia zamalowała 2 czy 3 pola</li>
	<li>jeśli Hektor odkryje pola 1 i 2, oba mogą okazać się zamalowane. W takim wypadku Hektor nie wie, czy Kornelia zamalowała 3, 4, czy 5 p&oacute;l.</li>
	<li>...</li>
</ul>