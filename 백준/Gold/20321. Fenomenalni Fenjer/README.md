# [Gold IV] Fenomenalni Fenjer - 20321

[문제 링크](https://www.acmicpc.net/problem/20321)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 26, 정답: 12, 맞힌 사람: 11, 정답 비율: 44.000%

### 분류

정렬, 기하학, 스위핑, 피타고라스 정리

### 문제 설명

<p>U malenom mjesta&scaron;cu <em>Cugovec Bi&scaron;kupečki</em> živi n stanovnika, svaki u svojoj kući. Nažalost, u taj dio Lijepe Na&scaron;e jo&scaron; nije stigao super brzi internet, a glavni razlog tome je &scaron;to niti jedno kućanstvo nije opskrbljeno električnom energijom. Shodno tome, stanovnici Cugovca Bi&scaron;kupečkog slobodno vrijeme ne provode rje&scaron;avajući algoritamske zadatke na popularnim internetskim stranicama, već samo smi&scaron;ljaju algoritme koristeći papir i olovku. Dakako, najteže im pada zimsko razdoblje kada brzo padne mrak pa moraju rje&scaron;avati zadatke u glavi jer vi&scaron;e ne vide &scaron;to su zapisali na papir.</p>

<p>Međutim, ove su zime odlučili stati na kraj svom problemu. Jedan je stanovnik uskliknuo da posjeduje svijeću, ali je ne može upaliti. Drugi mu stanovnik odvrati da posjeduje upaljač, treći se pak javi da posjeduje fenjer, a četvrti je ba&scaron; jutros prona&scaron;ao dugačak &scaron;tap. Fenomenalni plan je ubrzo skovan, kada padne mrak upaljenu će svijeću staviti u fenjer kojeg će namontirati na &scaron;tap koji će pak biti zabijen u zemlju. Ostalo je jo&scaron; samo odrediti lokaciju na kojoj će postaviti &scaron;tap.</p>

<p>Koristeći metode matematike i računanja, stanovnici su zaključili da će fenjer obasjavati kružnu povr&scaron;inu radijusa r. Također su se zajednički dogovorili da će &scaron;tap postaviti na neko mjesto duž ulice koja prolazi Cugovcem Bi&scaron;kupečkim, i to tako da svjetlost obasjava maksimalan broj kuća. Dakako, problem su zatim smjestili u koordinatni sustav gdje su ulicu polegli na x-os te odredili koordinate svake kuće.</p>

<p>Možete li odrediti koliko će kuća biti osvjetljeno nakon &scaron;to stanovnici postave fenjer?</p>

<p><strong>Napomena</strong>: Kuća je obasjana ako se nalazi na rubu ili unutar kružnice radijusa r u čijem sredi&scaron;tu se nalazi fenjer. Optimalna pozicija fenjera ne nalazi se nužno na cjelobrojnim koordinatama.</p>

### 입력

<p>U prvom su retku prirodni brojevi n (1 &le; n &le; 100 000) i r (1 &le; r &le; 10<sup>9</sup>) iz teksta zadatka.</p>

<p>U i-tom od sljedećih n redaka nalaze se po dva cijela broja x<sub>i</sub> i y<sub>i</sub> (0 &le; |x<sub>i</sub>|, |y<sub>i</sub>| &le; 10<sup>9</sup>) koji predstavljaju koordinate kuće u kojoj živi i-ti stanovnik. Pozicije svih kuća međusobno su različite.</p>

### 출력

<p>U jedini redak ispi&scaron;ite traženi broj iz teksta zadatka.</p>