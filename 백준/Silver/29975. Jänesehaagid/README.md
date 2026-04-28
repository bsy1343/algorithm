# [Silver III] Jänesehaagid - 29975

[문제 링크](https://www.acmicpc.net/problem/29975)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 16, 정답: 12, 맞힌 사람: 11, 정답 비율: 73.333%

### 분류

기하학, 구현, 수학

### 문제 설명

<p>J&auml;nku-Juss &otilde;pib j&auml;nesehaake tegema ja ema andis talle harjutuse h&uuml;pata haakidega &uuml;le v&auml;lja. Kuna emal on ka muid tegemisi, pani ta Jussi telefoni h&uuml;ppeid salvestama, et ta saaks neid p&auml;rast anal&uuml;&uuml;sida.</p>

<p>Iga kord, kui Juss maad puudutab, salvestab telefon tema asukoha X- ja Y-koordinaadid. H&uuml;ppeks nimetame muidugi liikumist &uuml;hest sellisest punktist j&auml;rgmisse. Haakidega l&auml;&auml;nest itta h&uuml;ppamise seeriaks nimetame j&auml;rjestikuste h&uuml;pete jada, milles on v&auml;hemalt kaks h&uuml;pet ja milles h&uuml;pped on vaheldumisi kirde ja kagu suunas; alustada v&otilde;ib &uuml;ksk&otilde;ik kumma suunaga, aga edaspidi peavad suunad vahelduma. Kirde-suunaliseks nimetame h&uuml;pet, millega nii X- kui Y-koordinaat m&otilde;lemad kasvavad, kagu-suunaliseks aga h&uuml;pet, millega X-koordinaat kasvab ja Y-koordinaat kahaneb.</p>

<p>Kirjutada programm, mis saab Jussi telefoni salvestatud punktide jada ja leiab selles pikima haakidega l&auml;&auml;nest itta h&uuml;ppamise seeria.</p>

### 입력

<p>Tekstifaili esimesel real on telefoni salvestatud punktide arv $N$ ($1 \le N \le 50\,000$). J&auml;rgmisel $N$ real on iga&uuml;hel kaks t&uuml;hikuga eraldatud t&auml;isarvu: &uuml;he punkti koordinaadid $X_i$ ja $Y_i$. Koordinaatide absoluutv&auml;&auml;rtused ei &uuml;leta $1\,000\,000$.</p>

### 출력

<p>Tekstifaili ainsale reale v&auml;ljastada h&uuml;pete arv pikimas haakidega l&auml;&auml;nest itta h&uuml;ppamise seerias. Kui Juss ei teinud &uuml;htegi haaki, v&auml;ljastada tekst <code>EI OLE</code>.</p>