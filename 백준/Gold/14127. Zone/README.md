# [Gold IV] Zone - 14127

[문제 링크](https://www.acmicpc.net/problem/14127)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 9, 정답: 9, 맞힌 사람: 8, 정답 비율: 100.000%

### 분류

구현, 자료 구조, 시뮬레이션

### 문제 설명

<p>U nizu mjera za unapređenje javnog prometa u glavnom gradu, prometno poduzeće odlučilo je promijeniti granice zona javnog prometa. Umjesto dosada&scaron;njeg kružnog modela, prelazi se na romboidni model. Grad je podijeljen na N zona označenih brojevima 1 do N. Zona 1 je kvadrat duljine stranica 1 km sa sredi&scaron;tem u samom centru grada. Zona 2 dobivena je &scaron;irenjem kvadrata zone 1 u jednom od smjerova sjever, istok, zapad ili jug, tako mu duljina stranice bude 2 km. Svaka sljedeća zona dobiva se daljnjim &scaron;irenjem kvadrata u jednom od navedenih smjerova, tako da se stranica svaki put produlji za 1 km.</p>

<p>Na slici je prikazana jedna moguća podjela grada na 4 zone: za zonu 2 odabran je smjer &scaron;irenja na sjever, za zonu 3 na zapad, a za zonu 4 ponovno na sjever.&nbsp;</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/14127.%E2%80%85Zone/53eee7fc.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/14127.%E2%80%85Zone/53eee7fc.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/14127/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202017-01-02%20%EC%98%A4%ED%9B%84%206.17.27.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:129px; width:144px" /></p>

<p>Cijena karte u svakoj zoni odgovara broju susjednih zona koje ju okružuju. Cijene karata u gornjem primjeru su tako 2 kn u zoni 1, 3 kn u zoni 2, 3 kn u zoni 3 te 2 kn u zoni 4.&nbsp;</p>

### 입력

<p>U prvom retku ulaza nalazi se broj N (2 &le; N &le; 300 000), broj zona.</p>

<p>U sljedećih N&minus;1 redaka nalazi se jedno od slova &#39;S&#39;, &#39;I&#39;, &#39;Z&#39;, &#39;J&#39;. Slovo u i-tom retku označava smjer &scaron;irenja odabran za zonu i.&nbsp;</p>

### 출력

<p>Potrebno je ispisati N redaka, po jedan za svaku zonu. U i-tom retku ispi&scaron;ite cijenu karte u i-toj zoni.&nbsp;</p>