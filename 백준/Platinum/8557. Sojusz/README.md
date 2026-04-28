# [Platinum III] Sojusz - 8557

[문제 링크](https://www.acmicpc.net/problem/8557)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 30, 정답: 11, 맞힌 사람: 10, 정답 비율: 40.000%

### 분류

이분 매칭

### 문제 설명

<p>Dawno, dawno temu, w odległej galaktyce istniały dwa państwa, kt&oacute;re postanowiły zawrzeć sojusz. Każde z państw obejmowało pewną liczbę planet. Niekt&oacute;re z planet były połączone wygodnymi&nbsp;<i>tunelami</i>&nbsp;nadprzestrzennymi I generacji. Każdy tunel łączył dwie planety i pozwalał na odbywanie podr&oacute;ży pasażerskich między nimi w kr&oacute;tkim czasie.</p>

<p>Pewnego dnia naukowcy odkryli&nbsp;<i>tunele</i>&nbsp;nadprzestrzenne II generacji, kt&oacute;re pozwalały odbywać podr&oacute;że w jeszcze kr&oacute;tszym czasie. Ulepszenie tunelu starszego typu do tunelu II generacji kosztowało wszędzie tyle samo. Politycy obu państw postanowili umocnić sojusz ulepszając do tuneli II generacji niekt&oacute;re tunele I generacji łączące planety z r&oacute;żnych państw. Aby żadna planeta nie czuła się skrzywdzona, ustalono, że każda planeta, kt&oacute;ra już posiadała jakiś tunel I generacji łączący ją z planetą przeciwnego państwa, powinna mieć ulepszony przynajmniej jeden z tych tuneli. Przystąpiono do realizacji plan&oacute;w, ale wydano zbyt dużo pieniędzy, oba państwa zbankrutowały, sojusz się rozpadł, a w galaktyce zapanował kosmiczny chaos.</p>

<p>Obecnie niekt&oacute;rzy historycy badający tamte wydarzenia uważają, że ulepszono w&oacute;wczas zbyt wiele tuneli, a całego zamieszania można było uniknąć. Z chęcią dowiedzieliby się, jaka była minimalna liczba tuneli, kt&oacute;re trzeba było unowocześnić, by spełnić ustalenia polityk&oacute;w. Twoim zadaniem będzie im w tym pom&oacute;c.</p>

<p>Napisz program, kt&oacute;ry:</p>

<ul>
	<li>wczyta ze standardowego wejścia opis sieci tuneli I generacji,</li>
	<li>znajdzie minimalną liczbę tuneli, kt&oacute;re należało ulepszyć, aby spełnić wymagania ustalone przez polityk&oacute;w,</li>
	<li>zapisze wynik na standardowe wyjście.</li>
</ul>

### 입력

<p>W pierwszym wierszu znajdują się dwie liczby całkowite <em>m</em>&nbsp;i <em>n</em>, oddzielone pojedynczym odstępem i określające odpowiednio liczby planet w pierwszym i drugim państwie, 1 &le; <em>m</em>, <em>n</em> &le; 2 000. Przyjmujemy, że planety w pierwszym państwie są ponumerowane liczbami całkowitymi od 1 do <em>m</em>, natomiast w drugim liczbami całkowitymi od <em>m</em> + 1&nbsp;do <em>n</em> + <em>m</em>. Drugi wiersz zawiera jedną liczbę całkowitą <em>k</em>, 1 &le; <em>k</em> &le; 10 000. Jest to liczba tuneli I generacji. Następne <em>k</em>&nbsp;wierszy zawiera opisy tuneli. Pojedynczy wiersz opisuje jeden tunel i zawiera parę liczb <em>a</em>, <em>b</em>&nbsp;oddzielonych pojedynczym odstępem, gdzie <em>a</em>&nbsp;i <em>b</em>&nbsp;są numerami planet połączonych tunelem. Zakładamy, że żaden tunel nie łączy planety z nią samą i że żadna para planet nie jest połączona kilkoma tunelami.</p>

### 출력

<p>W pierwszym i jedynym wierszu wyjścia powinna znaleźć się jedna liczba całkowita, będąca minimalną liczbą tuneli, kt&oacute;re należało ulepszyć.</p>