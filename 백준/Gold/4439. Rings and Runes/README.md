# [Gold II] Rings and Runes - 4439

[문제 링크](https://www.acmicpc.net/problem/4439)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 42, 정답: 15, 맞힌 사람: 14, 정답 비율: 58.333%

### 분류

브루트포스 알고리즘, 비트마스킹

### 문제 설명

<p>Frodo has entered the mines of Moria and encountered a series of gates. Each gate has written upon it an ancient riddle describing the state of a set of special rings which control that particular gate. By examining the riddle, Frodo can determine whether or not the gate can be opened, or if it is simply a death trap.</p>

<p>Riddles consist of multiple runes. A valid rune contains exactly 3 statements about 3 different rings. Each statement in a rune is either true or false, depending on the state (spinning or not spinning) of a specific ring in the set of rings controlling the gate. The riddle for a particular gate does not have to use all of the possible rings contained in the gate&rsquo;s controlling set.</p>

<p>To open the gates, the hobbits must read the riddle, then, decide which of the rings to spin, and which of the rings to leave alone. Once they have the correct rings spinning, they say an incantation, and if the entire riddle for the gate is satisfied the gate will open. For the gate to open, every rune in the riddle must have at least one statement in it that is true.</p>

<p>For example, consider a specific rune: 1 -2 3 0. This rune will be true if (ring 1 is spinning) OR (ring 2 is NOT spinning) OR (ring 3 is spinning). (NOTE: The 0 indicates the end of a rune, and at least one of the statements in that rune must be true for that specific rune to be true.) If a ring number in a rune is negative (e.g., -2), it means that ring 2 must NOT be spinning for that particular statement in the rune to be true. If the ring number is positive, (e.g., 3) it means that ring 3 MUST be spinning for that statement in the rune to be true. A specific ring may only appear one time in a specific rune, however, a ring may be used multiple times in the entire riddle, just not in the same rune!</p>

### 입력

<p>The input will consist of the following:</p>

<ul>
	<li>The first line of input contains a single integer g (where 1 &le; g &le; 30), which denotes the number of gates with riddles to be decoded.</li>
	<li>The first line for each gate contains two integers, rings (where 3 &le; rings &le; 22) and runes (where 1 &le; runes &le; 100), separated by a space. rings is the number of rings in the controlling set; each ring is numbered from 1 to rings, and riddles are not required to use every possible ring. runes is the number of runes that must be satisfied by the set of rings.</li>
	<li>The next runes lines describe individual runes that specify the relationships between the rings for that gate. Each rune is represented by a single line containing four numbers: r<sub>1</sub>, r<sub>2</sub>, r<sub>3</sub>, and 0, where each of these numbers are separated by a space. The first three numbers are 32-bit integers.</li>
</ul>

### 출력

<p>Each gate contains exactly one riddle (consisting of multiple runes), and your algorithm should output exactly one line for each gate. If one or more runes in a riddle contain errors, output only the highest priority error for that riddle. The priority of errors is described below:</p>

<ul>
	<li>If ANY rune in a riddle contains a statement about a null ring, e.g., 0 or &minus;0, this is the most severe error in a riddle, and the whole riddle is invalid. Output &ldquo;INVALID: NULL RING&rdquo; as the highest priority error.</li>
	<li>If ANY rune in a riddle contains a statement r or &minus;r where (r &lt; &minus;rings) or (r &gt; rings) then this is the SECOND most severe error in a riddle, and so output &ldquo;INVALID: RING MISSING&rdquo;. NOTE: Do NOT output this message if the riddle contained a NULL ring!</li>
	<li>If ANY individual rune refers to the same ring more than once (e.g. -2 2 3 0 OR 3 1 1 0), this is the THIRD most severe error, so output &ldquo;INVALID: RUNE CONTAINS A REPEATED RING&rdquo;. Again, don&rsquo;t output this message if a higher priority error occurred somewhere in the riddle.</li>
	<li>Riddles may contain repeated runes. Treat all of these repeated runes as a single rune; since they are identical, if one is true all of the repeated runes will be true.</li>
	<li>If there is a configuration of spinning / still rings that satisfies all the runes in the riddle, output &ldquo;RUNES SATISFIED!&rdquo;</li>
	<li>If there is no possible configuration of spinning / still rings that satisfies all the runes, output &ldquo;RUNES UNSATISFIABLE! TRY ANOTHER GATE!&rdquo;</li>
</ul>