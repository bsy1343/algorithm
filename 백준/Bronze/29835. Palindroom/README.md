# [Bronze II] Palindroom - 29835

[문제 링크](https://www.acmicpc.net/problem/29835)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 187, 정답: 108, 맞힌 사람: 97, 정답 비율: 57.059%

### 분류

구현, 그리디 알고리즘, 문자열

### 문제 설명

<p>Kevin sai informaatikaol&uuml;mpiaadi eelvooru palindroomi&uuml;lesande eest maksimumpunktid. Seda n&auml;hes andis &otilde;petaja talle natuke raskema &uuml;lesande, milles uuritakse mitmesuguse pikkusega tekstilisi palindroome.</p>

<p>Sarnaselt arvujada juhtumiga nimetatakse teksti palindroomiks, kui see on sama eest tahapoole ja tagant ettepoole lugedes. N&auml;iteks <code>ABBA</code> on palindroom (sest see on ka tagurpidi lugedes <code>ABBA</code>), aga <code>ABCD</code> ei ole (sest see on tagurpidi lugedes <code>DCBA</code>).</p>

<p>Kirjutada programm, mis leiab v&auml;hima v&otilde;imaliku arvu t&auml;heasendustega viisi antud tekst palindroomiks muuta.</p>

### 입력

<p>Sisendi esimesel real on t&auml;isarv $N$ ($1 \le N \le 300$).</p>

<p>Teisel real on $N$ suurest ladina t&auml;hest (<code>A</code> $\ldots$ <code>Z</code>) koosnev tekst.</p>

### 출력

<p>V&auml;ljundi esimesele reale v&auml;ljastada t&auml;isarv $K$, mis n&auml;itab, mitu t&auml;hte on minimaalselt vaja asendada, et sisendis antud tekstist saaks palindroom.</p>

<p>Teisele reale v&auml;ljastada saadud palindroom. Kui minimaalse t&auml;heasenduste arvuga palindroome on mitu, v&auml;ljastada neist (ladina t&auml;hestiku j&auml;rgi) t&auml;hestikulises j&auml;rjekorras esimene.</p>