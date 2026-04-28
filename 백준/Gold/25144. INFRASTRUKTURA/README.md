# [Gold III] INFRASTRUKTURA - 25144

[문제 링크](https://www.acmicpc.net/problem/25144)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 16, 정답: 3, 맞힌 사람: 3, 정답 비율: 50.000%

### 분류

그래프 이론, 정렬, 애드 혹, 트리, 해 구성하기, 두 포인터

### 문제 설명

<p>Ivica je predsjednik države u nastajanju. Svaka takva država mora rije&scaron;iti problem prometne povezanosti izgradnjom pripadajuće infrastrukture.</p>

<p>U državi ima N gradova. Ivica želi izgraditi N-1 dvosmjernu cestu između tih gradova tako da se može od bilo kojeg grada, koristeći samo te ceste, doputovati do bilo kojeg drugog grada.</p>

<p>Svaki gradonačelnik je javio Ivici rezultate referenduma o utjecaju na ekonomiju i zagađenje takvog projekta te inzistira da grad i mora imati točno D<sub>i</sub> cesta prema drugim gradovima.</p>

<p>Ivicu zanima je li moguće izgraditi N-1 dvosmjernu cestu tako da se zadovolje želje svih gradova.</p>

### 입력

<p>U prvom retku nalazi se prirodan broj N (1 &le; N &le; 100000), broj gradova iz teksta zadatka.</p>

<p>U drugom retku nalazi se N brojeva D<sub>i</sub> (0 &le; D<sub>i</sub> &le; N-1) odvojenih razmakom, brojevi iz teksta zadatka.</p>

### 출력

<p>U prvi redak treba ispisati NE ukoliko nije moguće ispuniti želje svih gradova ili DA u suprotnom.</p>

<p>U slučaju da je odgovor DA treba ispisati N-1 red, u svakom po par i&lt;j koji označava cestu između gradova i i j tako da zadovoljavaju tražene uvjete. Redoslijed ispisa parova nije bitan.</p>