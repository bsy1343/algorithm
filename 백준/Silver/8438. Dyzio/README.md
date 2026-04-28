# [Silver I] Dyzio - 8438

[문제 링크](https://www.acmicpc.net/problem/8438)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 27, 정답: 12, 맞힌 사람: 12, 정답 비율: 52.174%

### 분류

재귀

### 문제 설명

<p>Dyzio jest przyjacielem Jaśka i też lubi zagadki. Oto zagadka, z kt&oacute;rą Dyzio przyszedł do Jaśka:</p>

<blockquote>Jaśku, masz tu sznurek, kt&oacute;ry trzeba pociąć na mniejsze kawałki. Nie powiem Ci wprost, jak to zrobić, ale popatrz na ten ciąg zer (0) i jedynek (1). Jedynka na początku oznacza, że sznurek trzeba przeciąć na p&oacute;ł. Jeśli jednak pierwszą cyfrą byłoby zero, to byłaby to jedyna cyfra w ciągu i oznaczałaby, że nie musisz już nic robić - chcę mieć sznurek w całości. Jeśli jednak musisz przeciąć sznurek, to po pierwszej jedynce zapisałem, co zrobić z lewym kawałkiem (stosując te same reguły, co dla całego sznurka), a następnie zapisałem co zrobić z prawym kawałkiem (cały czas trzymając się tych samych zasad zapisu). Zawsze musisz najpierw pociąć lewy kawałek, a dopiero potem mozesz zabrać się do prawego. A teraz tnij i powiedz, ile minimalnie cięć trzeba wykonać, żeby otrzymać najkr&oacute;tszy kawałek.</blockquote>

<p>Niestety mama chowa przed Jaśkiem nożyczki, ale szczęśliwie pod ręką był komputer i Jasiek szybko napisał program symulujący cięcie sznurka. Czy Ty też potrafisz napisać taki program?</p>

<p>Napisz program, kt&oacute;ry:</p>

<ul>
	<li>wczyta (ze standardowego wejścia) opis sposobu cięcia sznurka,</li>
	<li>policzy, ile minimalnie cięć trzeba wykonać, żeby dostać (pierwszy) najkr&oacute;tszy kawałek,</li>
	<li>wypisze wynik (na standardowe wyjście).</li>
</ul>

### 입력

<p>Pierwszy wiersz wejścia zawiera liczbę całkowitą <em>n</em>&nbsp;(1 &le; <em>n</em> &le; 20000). W drugim wierszu wejścia zapisano dokładnie jedno słowo zero-jedynkowe (ciąg zer i jedynek bez znak&oacute;w odstępu między nimi) długości&nbsp;<em>n</em>&nbsp;- opis sposobu cięcia sznurka dostarczony przez Dyzia.</p>

### 출력

<p>Tw&oacute;j program powinien wypisać (na standardowe wyjście) tylko jeden wiersz i zawierający tylko jedną liczbę całkowitą, r&oacute;wną minimalnej liczbie cięć, kt&oacute;re trzeba wykonać, żeby dostać najkr&oacute;tszy kawałek.</p>