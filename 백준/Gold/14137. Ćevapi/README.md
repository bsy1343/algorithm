# [Gold III] Ćevapi - 14137

[문제 링크](https://www.acmicpc.net/problem/14137)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 128 MB

### 통계

제출: 11, 정답: 3, 맞힌 사람: 3, 정답 비율: 60.000%

### 분류

자료 구조, 집합과 맵, 트리를 사용한 집합과 맵

### 문제 설명

<p>Goran živi u malom gradu na velikoj rijeci. Rijeku možemo predstaviti jediničnim pravcem. Goran živi na koordinati 0, a rijeka teče u smjeru rastućih koordinata. Obalu rijeke na kojoj Goran živi označit ćemo slovom A, a onu drugu slovom B.</p>

<p>Ba&scaron; od sutra na rijeku će početi pu&scaron;tati splavare koji će svojim splavima za jeftine novce prevoziti ljude s jedne strane na drugu, pritom nudeći putnicima fini topli ro&scaron;tilj. Sutra će u pogon pustiti prvu splav, prekosutra drugu, za tri dana treću i tako dalje.</p>

<p>Kako na splavima ne radi nitko osim splavara, oni prevoze putnike samo u jednom smjeru, dok u povratku peku ro&scaron;tilj za novu turu i ne primaju putnike. Kažemo da splavari koji prevoze putnike s obale A na obalu B plove u smjeru 1, dok splavari koji prevoze putnike s obale B na obalu A plove u smjeru 2.</p>

<p>Kako svi njegovi prijatelji navečer trče uz rijeku kako bi održali vitku liniju, Goran je ovdje ugledao sjajnu priliku da se i on dovede u red &ndash; trčanje uz ćevape!</p>

<p>On će svaki dan uredno otrčati točno L metara nizvodno uz rijeku, ali neće propustiti priliku da omasti brk toplim ćevapima. Naime, svaki put kada na svom putu naleti na pristani&scaron;te splavi koja operira prema drugoj strani rijeke, Goran će pričekati splav, zatim se ukrcati te se odmoriti uz porciju ćevapa dok plovi na drugu stranu rijeke, gdje će se iskrcati i krenuti dalje.</p>

<p>Zadane su informacije o splavima redom kojim će se pustiti u pogon. Za svaku splav poznat nam smjer u kojem plovi (smjer 1 ili smjer 2), te udaljenost od Goranove kuće. Napi&scaron;ite program koji će za svaki dan odrediti koliko će metara Goran pretrčati na A obali, koliko na B obali, te koliko porcija ćevapa pojesti.</p>

<p>Slijedi ilustracija prvog primjera:&nbsp;</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/14137.%E2%80%85%C4%86evapi/8d2a153d.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/14137.%E2%80%85%C4%86evapi/8d2a153d.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/14137/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202017-01-03%20%EC%98%A4%ED%9B%84%202.34.36.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:90px; width:581px" /><br />
Prvi dan Goran će na obali A pretrčati 500 metara, na obali B 100 metara, te pojesti 1 porciju ćevapa.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/14137.%E2%80%85%C4%86evapi/e0605e69.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/14137.%E2%80%85%C4%86evapi/e0605e69.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/14137/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202017-01-03%20%EC%98%A4%ED%9B%84%202.34.45.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:89px; width:581px" /><br />
Drugi dan Goran će na obali A pretrčati 150 metara, na obali B 450 metara, te pojesti 1 porciju ćevapa.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/14137.%E2%80%85%C4%86evapi/babe20b2.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/14137.%E2%80%85%C4%86evapi/babe20b2.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/14137/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202017-01-03%20%EC%98%A4%ED%9B%84%202.34.55.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:90px; width:581px" /><br />
Treći dan Goran će na obali A pretrčati 350 metara, na obali B 250 metara, te pojesti 3 porcije ćevapa.</p>

### 입력

<p>U prvom retku nalaze se dva prirodna broja N i L (1 &le; N &le; 100 000, N &lt; L &lt; 109 ), broj dana i udaljenost koju Goran svaki dan mora pretrčati.</p>

<p>U svakom od sljedećih N redaka nalazi se opis splavi koja je počela ploviti taj dan. Opis splavi se sastoji od dva prirodna broja S i D (1 &le; S &le; 2, 0 &lt; D &lt; L), smjer u kojem splav plovi i udaljenost od Goranove kuće.</p>

<p>Nijedan par splavara neće ploviti na istoj udaljenosti od Goranove kuće.&nbsp;</p>

### 출력

<p>Za svaki od N dana potrebno je ispisati po tri cijela broja u zaseban redak, broj pretrčanih metara na obali A, broj pretrčanih metara na obali B, te broj pojedenih porcija ćevapa taj dan.&nbsp;</p>