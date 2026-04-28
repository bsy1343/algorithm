# [Bronze I] Inteligentna Ines - 31196

[문제 링크](https://www.acmicpc.net/problem/31196)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 53, 정답: 49, 맞힌 사람: 36, 정답 비율: 92.308%

### 분류

구현, 문자열

### 문제 설명

<p>Mali Ivica svake večeri &scaron;alje maloj Marici tajne podatke e-po&scaron;tom. Oni znaju da Ivičino e-pismo na putu do Maričinog e-pretinca potpuno neza&scaron;tićeno prolazi preko vi&scaron;e različitih računala u mreži, pa su se dogovorili da će svaku poruku Ivica &scaron;ifrirati prema sljedećem algoritmu:</p>

<ul>
	<li>Neka se poruka koju Ivica želi poslati Marici sastoji od $n$ znakova.</li>
	<li>Ivica prvo mora pronaći tablicu koja se sastoji od $r$ redaka i $s$ stupaca takvu da je $r &le; s$ i da je $n = rs$. Ako postoji vi&scaron;e takvih tablica, Ivica treba odabrati onu koja ima &scaron;to je moguće vi&scaron;e redaka.</li>
	<li>Ivica zapisuje poruku u tablicu po recima odozgo prema dolje, a unutar retka slijeva nadesno. Tako u prvi red upisuje prvi dio poruke, u drugi red drugi dio poruke itd.</li>
	<li>Poruka koju Ivica &scaron;alje Marici dobiva se čitanjem tablice po stupcima slijeva nadesno, a unutar stupca odozgo prema dolje.</li>
</ul>

<p>Ljubomorna Ines presrela je &scaron;ifriranu e-poruku koju je Ivica poslao Marici. Napi&scaron;ite program koji će de&scaron;ifrirati tajnu poruku.</p>

### 입력

<p>U prvom je retku niz od barem jednog, a najvi&scaron;e $100$ malih slova engleske abecede koji predstavlja &scaron;ifriranu poruku koju je Ines presrela.</p>

### 출력

<p>U jedini redak potrebno je ispisati de&scaron;ifriranu poruku.</p>