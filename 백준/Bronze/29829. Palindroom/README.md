# [Bronze III] Palindroom - 29829

[문제 링크](https://www.acmicpc.net/problem/29829)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 217, 정답: 176, 맞힌 사람: 155, 정답 비율: 82.888%

### 분류

구현, 애드 혹

### 문제 설명

<p>Jada nimetatakse palindroomiks, kui see on sama eest tahapoole ja tagant ettepoole lugedes. N&auml;iteks jada 1, 2, 2, 1 on palindroom (sest see on ka tagurpidi lugedes 1, 2, 2, 1), aga jada 1, 2, 3, 4 ei ole (sest see on tagurpidi lugedes 4, 3, 2, 1).</p>

<p>Kirjutada programm, mis kontrollib, kas antud 4-elemendilisest arvujadast saab palindroomi, kui selles v&otilde;ib muuta maksimaalselt &uuml;he elemendi v&auml;&auml;rtust.</p>

### 입력

<p>Ainsal real on neli t&uuml;hikutega eraldatud t&auml;isarvu v&auml;&auml;rtustega $1 \ldots 9$.</p>

### 출력

<p>Kui sisendis antud jada juba on palindroom v&otilde;i kui selle saab &uuml;he elemendi muutmisega palindroomiks teha, tr&uuml;kkida v&auml;ljundi esimesele reale s&otilde;na &#39;\verb&#39;JAH&quot; ja teisele reale neli t&uuml;hikutega eraldatud t&auml;isarvu: saadud palindroom. Kui v&otilde;imalikke palindroome on mitu, v&auml;ljastada &uuml;ksk&otilde;ik milline neist.</p>

<p>Kui sisendis antud jada maksimaalselt &uuml;he elemendi muutmisega palindroomiks teha ei saa, tr&uuml;kkida v&auml;ljundi ainsale reale s&otilde;na &#39;\verb&#39;EI&quot;.</p>

<p>NB! V&auml;ljundisse <strong>ei tohi</strong> v&auml;ljastada &uuml;htegi muud s&otilde;na v&otilde;i s&uuml;mbolit (st v&auml;ljund peaks olema kas &#39;\verb&#39;JAH&quot; ja t&auml;pselt neli t&auml;isarvu v&otilde;i &#39;\verb&#39;EI&quot; ja mitte midagi muud).</p>