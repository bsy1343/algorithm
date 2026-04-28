# [Silver I] Mrlja - 25162

[문제 링크](https://www.acmicpc.net/problem/25162)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 15, 정답: 15, 맞힌 사람: 13, 정답 비율: 100.000%

### 분류

구현, 문자열, 브루트포스 알고리즘

### 문제 설명

<p>Mirko je po svojoj bilježnici prolio kakao i tako je nasred prednje stranice (naslovnice) nastala mrlja. Mirko će mrlju prekriti naljepnicom. Da problem bude veći, i mrlja i naljepnica neobičnih su oblika pa Mirko možda neće uspjeti prekriti cijelu mrlju.</p>

<p>Mrlju opisujemo kao skup polja označenih znakovima # unutar zami&scaron;ljene tablice od N x N polja koja predstavlja sredinu stranice. Naljepnicu opisujemo na isti način, kao skup polja označenih znakovima # unutar zami&scaron;ljene tablice istih dimenzija. Pogledaj donje primjere za bolje razumijevanje.</p>

<p>Mirko može:</p>

<ol>
	<li>rotirati naljepnicu (za vi&scaron;ekratnike od 90&deg;), bez preokretanja;</li>
	<li>pomaknuti naljepnicu u bilo kojem smjeru tako da &scaron;to bolje prekrije mrlju.</li>
</ol>

<p>Mogućnost 1 znači da Mirko može naljepnicu postaviti u četiri različita oblika s obzirom na stranicu. Mogućnost 2 znači da Mirkova naljepnica može izaći i izvan tablice koja opisuje mrlju.</p>

<p>Pomozi Mirku i napi&scaron;i program koji odgovara na sljedeće pitanje: koliki je najmanji broj dijelova mrlje koje će ostati vidljive ispod naljepnice nakon pokrivanja? (Ako je mrlju moguće potpuno prekriti, odgovor je nula.)</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/ec50d876-af7f-4625-9386-2af0ea721740/-/preview/" style="width: 532px; height: 130px;" /></p>

<p style="text-align: center;">Slika opisuje treći primjer niže. Lijevo je mrlja, a u sredini naljepnica, koju valja rotirati udesno (za 90&deg; u smjeru kazaljke sata) i potom pomaknuti tako da prekrije sve osim jednog (gornjeg desnog) dijela mrlje, kao na desnom dijelu slike.</p>

### 입력

<p>U prvom je retku broj N (1 &le; N &le; 10) iz teksta zadatka, dimenzija zami&scaron;ljene tablice.</p>

<p>Sljedećih N redaka sadrži po N znakova (bez razmaka) koji opisuju mrlju. Znakovi ljestve (&quot;#&quot;) predstavljaju mrlju, a ostatak znakova su točke (&quot;.&quot;).</p>

<p>Slijedi prazan redak, a nakon njega N redaka od po N znakova koji na isti način opisuju naljepnicu.</p>

<p>(Polja koja predstavljaju mrlju bit će povezana, tj. mrlja se neće sastojati od odvojenih dijelova. Isto vrijedi za naljepnicu.)</p>

### 출력

<p>U prvi i jedini redak ispi&scaron;i traženi broj iz teksta zadatka.</p>

### 힌트

<p>Opis prvog probnog primjera: mrlja i naljepnica (nakon rotacije) posve su jednake pa ih možemo savr&scaron;eno preklopiti.</p>

<p>Opis drugog probnog primjera: kako god naljepnica bila položena na mrlju, barem jedan njezin dio ostat će nepokriven.</p>

<p>Opis trećeg probnog primjera: vidi sliku u tekstu zadatka.</p>