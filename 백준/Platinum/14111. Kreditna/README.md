# [Platinum III] Kreditna - 14111

[문제 링크](https://www.acmicpc.net/problem/14111)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 11, 정답: 4, 맞힌 사람: 4, 정답 비율: 44.444%

### 분류

애드 혹

### 문제 설명

<p>Marko je kao član kluba redovitih letača sakupio mnogo nagradnih milja, te se konačno odlučio počastiti putovanjem u Australiju. Međutim, kako to obično biva, nagradne milje ne pokrivaju sve tro&scaron;kove putovanja, pa ga je gospodin iz avio-kompanije telefonski zamolio da mu Marko e-mailom po&scaron;alje broj kreditne kartice (niz od 16 znamenki).</p>

<p>Marko je svjestan da je to suludo, ali gospodin s druge strane telefonske linije inzistira na tome. Marko je kao kompromis ponudio da po&scaron;alje broj kartice kriptiran sljedećim algoritmom:</p>

<ul>
	<li>Marko će pronaći najmanju znamenku u broju, a ako ih ima vi&scaron;e, među njima će odabrat prvu s lijeva. Nazovimo ovu znamenku A.</li>
	<li>Zatim će pronaći najveću znamenku u broju, a ako ih ima vi&scaron;e, među njima će odabrat zadnju. Nazovimo ovu znamenku B.</li>
	<li>Znamenku A će uvećati za 1, osim ako je već jednaka broju 9.</li>
	<li>Znamenku B će umanjiti za 1, osim ako je već jednaka broju 0.</li>
	<li>Konačno, Marko će znamenkama A i B zamijeniti pozicije.</li>
</ul>

<p>Na primjer, ako je broj njegove kartice 7691 0027 7960 3269, tada će Marko u e-mailu poslati broj: 7691 8027 7960 3261.</p>

<p>Napi&scaron;ite program koji će gospodinu iz avio-kompanije pomoći da odredi broj Markove kreditne kartice.&nbsp;</p>

### 입력

<p>U prvom i jedinom redu nalazi se niz od 16 znamenaka &lsquo;0&rsquo; - &lsquo;9&rsquo;, broj koji je Marko poslao u e-mailu.</p>

<p>Napomena: Broj kreditne kartice može početi sa znamenkom &lsquo;0&rsquo;.&nbsp;</p>

### 출력

<p>Ispi&scaron;ite sve moguće brojeve Markove kreditne kartice, po jedan u svaki red.</p>

<p>Ako ne postoji niti jedan valjani broj kreditne kartice, ispi&scaron;ite &ldquo;banana&rdquo;.&nbsp;</p>