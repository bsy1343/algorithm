# [Gold V] Tähekabe - 7198

[문제 링크](https://www.acmicpc.net/problem/7198)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 27, 정답: 12, 맞힌 사람: 10, 정답 비율: 41.667%

### 분류

그래프 이론, 그래프 탐색, 깊이 우선 탐색

### 문제 설명

<p>Tähekabe on lauamäng, mida mängitakse N &times; N ruudust koosneval laual, mille igas ruudus on üks t äht. Selles ülesandes vaatleme mängu lihtsustatud varianti, kus on ainult üks mängija ja üks nupp (tavaliselt mängivad 2&ndash;4 mängijat ja igauhel on 4 nuppu).</p>

<p>Mängija peab liigutama oma nuppu ühe ruudu kaupa üles, alla, vasakule või paremale (kuid mitte diagonaalis) nii, et tähtedest, millele nupp astub, moodustuks sõna. Näiteks all vasakul oleval joonisel punktiiriga märgitud ruudust alustades ja noolte suunas liikudes moodustub sõna &ldquo;TEST&rdquo; (lähteruut sõna moodustamisel arvesse ei lähe).</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/d2aaa91c-bf9e-4bef-a61b-fdce36485e74/-/preview/" style="width: 350px; height: 123px;" /></p>

<p>Käimisel kehtib kitsendus, et ükski ruut ei tohi sõna moodustamisel osaleda korduvalt. Näiteks ülal paremal oleval joonisel sõna &ldquo;KIRI&rdquo; moodustada ei saa, sest pärast &ldquo;KIR&rdquo; moodustamist on &ldquo;I&rdquo; juba kasutatud ja sellele ruudule tagasi minna enam ei tohi.</p>

<p>Kirjutada programm, mis saab mängulaua seisu ja leiab, milliseid antud sõnadest on mängijal võimalik moodustada.</p>

### 입력

<p>Tekstifaili kabesis.txt esimesel real on mängulaua suurus N (1 &le; N &le; 20) ning lähteruudu rea- ja veerunumber R ja V (read on nummerdatud ülalt alla ja veerud vasakult paremale 1 . . . N). Järgmisel N real on igaühel täpselt N tähte, mis kirjeldavad mängulaua seisu. Järgmisel real on uuritavate sõnade arv K (1 &le; K &le; 10) ja seejärel K real igaühel üks sõna pikkusega 1 . . . 15 tähte. Nii mängulaual kui sõnades on ainult suured ladina tähed.</p>

### 출력

<p>Tekstifaili kabeval.txt väljastada need sisendis antud sõnad, mida mängijal oleks võimalik laual olevas seisus moodustada. Sõnad väljastada igaüks eraldi reale samas järjekorras, nagu nad olid sisendis. Kui mängija ei saa ühtki sõna moodustada, väljastada faili ainsale reale tekst <code>EI SAA</code>.</p>