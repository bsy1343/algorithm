# [Bronze I] Murdude lahutamine - 29971

[문제 링크](https://www.acmicpc.net/problem/29971)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 45, 정답: 25, 맞힌 사람: 20, 정답 비율: 51.282%

### 분류

수학, 구현, 사칙연산, 많은 조건 분기

### 문제 설명

<p>Kirjutada programm, mis oskab harilikke murde lahutada.</p>

### 입력

<p>Tekstifaili esimesel ja teisel real on kaldkriipsu abil kirjutatud murrud $a/b$ ja $c/d$, kus $a$ ja $c$ on mittenegatiivsed ning $b$ ja $d$ positiivsed t&auml;isarvud suurusega kuni $1000$. Leida vahe $a/b-c/d$ lihtmurru v&otilde;i segaarvuna, kus murd on taandatud. V&auml;ljastada tulemus formaatimata kujul ja formaadituna.</p>

### 출력

<p>Tekstifaili esimesele reale v&auml;ljastada tulemuse t&auml;isosa (v&otilde;ib olla ka 0). Kui murdosa erineb nullist, siis v&auml;ljastada see teisele reale taandatud murruna kujul $x/y$. Kui murdosa on null, siis j&auml;tta faili teine rida t&uuml;hjaks.</p>

<p>Kui tulemuse murdosa erineb nullist, siis v&auml;ljastada tulemus ka formaaditud kujul. Faili kolmandale reale v&auml;ljastada tulemuse murdosa lugeja, neljandale reale t&auml;isosa ja miinusm&auml;rkidest moodustatud murrujoon, viiendale reale murdosa nimetaja. Murrujoone pikkus peab olema v&otilde;rdne nimetaja pikkusega. Lugeja ja nimetaja peavad real l&otilde;ppema samas positsioonis nagu murrujoon. Nulliga v&otilde;rduv t&auml;isosa j&auml;tta formaaditud kujus v&auml;ljastamata.</p>

<p>Kui tulemus on negatiivne, siis t&auml;histada seda miinusm&auml;rgiga t&auml;isosa ees. Negatiivse vastuse ja t&auml;isosa puudumise korral v&auml;ljastada t&auml;isosaks formaatimata kujul <code>-0</code> ja formaaditud kujul m&auml;rkida miinusm&auml;rk murru ette ilma arvuta <code>0</code> (vt n&auml;idet). Mittenegatiivse vastuse puhul m&auml;rki mitte v&auml;ljastada.</p>

<p>K&otilde;ik tulemused v&auml;ljastada t&uuml;hikuteta, v&auml;lja arvatud segaarvu murdosa nimetaja ja lugeja joondamiseks vajalikud t&uuml;hikud kolmanda ja viienda rea alguses.</p>