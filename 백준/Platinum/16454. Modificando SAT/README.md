# [Platinum II] Modificando SAT - 16454

[문제 링크](https://www.acmicpc.net/problem/16454)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 9, 정답: 3, 맞힌 사람: 3, 정답 비율: 75.000%

### 분류

수학, 문자열, 파싱, 선형대수학, 가우스 소거법, 배타적 논리합 기저 (gf(2))

### 문제 설명

<p>O problema da Satisfatibilidade Booleana (conhecido como SAT) consiste em decidir, dada uma f&oacute;rmula booleana na forma normal conjuntiva, se existe alguma atribui&ccedil;&atilde;o de valores &ldquo;verdadeiro&rdquo; ou &ldquo;falso&rdquo; a suas vari&aacute;veis de forma que a f&oacute;rmula inteira seja verdadeira.</p>

<p>Na forma normal conjuntiva, a f&oacute;rmula &eacute; dada em um formato bem espec&iacute;fico. Em primeiro lugar, as &uacute;nicas opera&ccedil;&otilde;es l&oacute;gicas utilizadas s&atilde;o o &ldquo;E&rdquo;, o &ldquo;OU&rdquo; e a nega&ccedil;&atilde;o, denotados por &and;, &or; e &not;, respectivamente. Uma f&oacute;rmula &eacute; formada atrav&eacute;s da opera&ccedil;&atilde;o &ldquo;E&rdquo; de diferentes partes, chamadas cl&aacute;usulas, C<sub>1</sub>, . . . , C<sub>m</sub>. Desta forma, uma f&oacute;rmula ϕ ter&aacute; o seguinte formato:</p>

<p style="text-align: center;">ϕ = C<sub>1</sub> &and; &middot; &middot; &middot; &and; C<sub>m</sub>.</p>

<p>Al&eacute;m disso, cada uma das cl&aacute;usulas tamb&eacute;m possui um formato espec&iacute;fico. Em particular, cada uma das cl&aacute;usulas &eacute; composta pelo &ldquo;OU&rdquo; de literais, que s&atilde;o vari&aacute;veis ou nega&ccedil;&otilde;es de vari&aacute;veis, cercada por par&ecirc;nteses. Assim, (x<sub>1</sub> &or; &not;x<sub>2</sub>) &eacute; uma cl&aacute;usula v&aacute;lida, enquanto (x<sub>1</sub> &and; &not;x<sub>2</sub>) n&atilde;o o seria, por usar o operador &ldquo;E&rdquo;. Um exemplo completo de f&oacute;rmula seria:</p>

<p style="text-align: center;">ϕ = (x<sub>1</sub> &or; x<sub>2</sub> &or; x<sub>3</sub>) &and; (&not;x<sub>1</sub>) &and; (x<sub>1</sub> &or; &not;x<sub>2</sub> &or; x<sub>3</sub>) &and; (x<sub>2</sub> &or; &not;x<sub>3</sub>).</p>

<p>Uma varia&ccedil;&atilde;o do problema SAT &eacute; conhecida como k-SAT, onde cada cl&aacute;usula possui no m&aacute;ximo k literais. A f&oacute;rmula acima seria um exemplo de inst&acirc;ncia do problema 3-SAT, mas n&atilde;o de 2-SAT. Note que, em todos estes problemas, para uma f&oacute;rmula ser verdadeira, cada uma das cl&aacute;usulas deve ser verdadeira e, portanto, pelo menos um dos literais (da forma x<sub>i</sub> ou &not;x<sub>i</sub>) de cada cl&aacute;usula deve ser verdadeiro.</p>

<p>Uma atribui&ccedil;&atilde;o &eacute; um modo de definir as vari&aacute;veis como verdadeiras ou falsas. Neste problema estamos interessados em numa varia&ccedil;&atilde;o do problema 3-SAT, no qual uma atribui&ccedil;&atilde;o v&aacute;lida deve ter exatamente 1 ou exatamente 3 literais verdadeiros em cada cl&aacute;usula. Dada uma f&oacute;rmula, sua tarefa &eacute; decidir se existe uma atribui&ccedil;&atilde;o v&aacute;lida, levando em conta tal restri&ccedil;&atilde;o extra. Caso haja uma atribui&ccedil;&atilde;o v&aacute;lida, voc&ecirc; deve imprimir a lexicograficamente m&aacute;xima. A ordem lexicogr&aacute;fica &eacute; definida do seguinte modo: dadas duas atribui&ccedil;&otilde;es diferentes, podemos compar&aacute;-las olhando para a vari&aacute;vel de menor &iacute;ndice que difere nas duas atribui&ccedil;&otilde;es; das duas, a maior atribui&ccedil;&atilde;o &eacute; a que d&aacute; valor verdadeiro para tal vari&aacute;vel.</p>

### 입력

<p>A primeira linha da entrada cont&eacute;m dois inteiros M e N (1 &le; M, N &le; 2000), descrevendo o n&uacute;mero de cl&aacute;usulas e vari&aacute;veis, respectivamente. Em seguida, ser&atilde;o fornecidas M linhas, cada uma descrevendo uma cl&aacute;usula (veja o exemplo para detalhes do formato). Cl&aacute;usulas consecutivas s&atilde;o separadas pela string &ldquo; and&rdquo;. Cada cl&aacute;usula cont&eacute;m no m&aacute;ximo 3 literais. As vari&aacute;veis s&atilde;o denotadas por &ldquo;x&rdquo; seguido de um n&uacute;mero entre 1 e N. N&atilde;o haver&aacute; dois espa&ccedil;os consecutivos, nem haver&aacute; espa&ccedil;o no final das linhas.</p>

<p>O primeiro exemplo descreve a f&oacute;rmula ϕ acima.</p>

### 출력

<p>Seu programa deve imprimir uma &uacute;nica linha contendo N caracteres correspondentes a atribui&ccedil;&atilde;o v&aacute;lida lexicograficamente m&aacute;xima, ou impossible caso n&atilde;o haja atribui&ccedil;&atilde;o v&aacute;lida. O i-&eacute;simo caractere deve ser T se a vari&aacute;vel &eacute; verdadeira na atribui&ccedil;&atilde;o e F caso contr&aacute;rio.</p>