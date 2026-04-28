# [Gold III] Jurassic Remains - 7406

[문제 링크](https://www.acmicpc.net/problem/7406)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 26, 정답: 16, 맞힌 사람: 12, 정답 비율: 54.545%

### 분류

브루트포스 알고리즘, 비트마스킹

### 문제 설명

<p>Paleontologists in Siberia have recently found a number of fragments of Jurassic period dinosaur skeleton. The paleontologists have decided to forward them to the paleontology museum. Unfortunately, the dinosaur was so huge, that there was no box that the fragments would fit into. Therefore it was decided to split the skeleton fragments into separate bones and forward them to the museum where they would be reassembled. To make reassembling easier, the joints where the bones were detached from each other were marked with special labels. Meanwhile, after packing the fragments, the new bones were found and it was decided to send them together with the main fragments. So the new bones were added to the package and it was sent to the museum.</p>

<p>However, when the package arrived to the museum some problems have shown up. First of all, not all labels marking the joints were distinct. That is, labels with letters &#39;A&#39; to &#39;Z&#39; were used, and each two joints that had to be connected were marked with the same letter, but there could be several pairs of joints marked with the same letter.&nbsp;</p>

<p>Moreover, the same type of labels was used to make some marks on the new bones added to the box. Therefore, there could be bones with marked joints that need not be connected to the other bones. The problem is slightly alleviated by the fact that each bone has at most one joint marked with some particular letter.</p>

<p>Your task is to help the museum workers to restore some possible dinosaur skeleton fragments. That is, you have to find such set of bones, that they can be connected to each other, so that the following conditions are true:</p>

<ul>
	<li>If some joint is connected to the other joint, they are&nbsp; marked with the same label.</li>
	<li>For each bone from the set each joint marked with some label&nbsp; is connected to some other joint.</li>
	<li>The number of bones used is maximal possible.</li>
</ul>

<p>&nbsp;Note that two bones may be connected using several joints.</p>

### 입력

<p>The first line of the input file contains $N$ --- the number of bones ($1 \le N \le 24$). Next $N$ lines contain bones descriptions: each line contains a non-empty sequence of different capital letters, representing labels marking the joints of the corresponding bone.</p>

### 출력

<p>On the first line of the output file print $L$ --- the maximal possible number of bones that could be used to reassemble skeleton fragments. After that output $L$ integer numbers in ascending order --- the bones to be used. Bones are numbered starting from one, as they are given in the input file.</p>