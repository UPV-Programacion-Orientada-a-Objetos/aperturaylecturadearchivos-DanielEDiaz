PGDMP     !    3                x           ProyectoHorarios    12.1    12.1 F    |           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            }           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            ~           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false                       1262    16613    ProyectoHorarios    DATABASE     �   CREATE DATABASE "ProyectoHorarios" WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'Spanish_Spain.1252' LC_CTYPE = 'Spanish_Spain.1252';
 "   DROP DATABASE "ProyectoHorarios";
                postgres    false            �            1259    16691    aula_equipo    TABLE     �   CREATE TABLE public.aula_equipo (
    id_equipo smallint NOT NULL,
    id_aula character varying(10) NOT NULL,
    cantidad smallint DEFAULT 0
);
    DROP TABLE public.aula_equipo;
       public         heap    postgres    false            �            1259    16629    aulas    TABLE       CREATE TABLE public.aulas (
    id_aula character varying(10) NOT NULL,
    nombre character varying(100) NOT NULL,
    tipo character varying(20) NOT NULL,
    capacidad integer NOT NULL,
    descripcion character varying(100),
    ubicacion character varying(20)
);
    DROP TABLE public.aulas;
       public         heap    postgres    false            �            1259    16624    carrera    TABLE     l   CREATE TABLE public.carrera (
    idcarrera smallint NOT NULL,
    nombre_carrera character varying(100)
);
    DROP TABLE public.carrera;
       public         heap    postgres    false            �            1259    16634    categorias_equipo    TABLE     �   CREATE TABLE public.categorias_equipo (
    id_categoria smallint NOT NULL,
    nombre character varying(100) NOT NULL,
    descripcion character varying(300)
);
 %   DROP TABLE public.categorias_equipo;
       public         heap    postgres    false            �            1259    16731    disponibilidad    TABLE     �   CREATE TABLE public.disponibilidad (
    dia smallint NOT NULL,
    espacio_tiempo smallint NOT NULL,
    clv_usuario character varying(50) NOT NULL
);
 "   DROP TABLE public.disponibilidad;
       public         heap    postgres    false            �            1259    16669    equipo    TABLE     �   CREATE TABLE public.equipo (
    id_equipo smallint NOT NULL,
    id_categoria smallint NOT NULL,
    nombre character varying(100) NOT NULL,
    descripcion character varying(100) NOT NULL
);
    DROP TABLE public.equipo;
       public         heap    postgres    false            �            1259    16741    grupo_materia_profesor    TABLE     �   CREATE TABLE public.grupo_materia_profesor (
    clv_grupo character varying(10) NOT NULL,
    clv_materia character varying(10) NOT NULL,
    clv_usuario character varying(50) NOT NULL
);
 *   DROP TABLE public.grupo_materia_profesor;
       public         heap    postgres    false            �            1259    16619    grupos    TABLE     `   CREATE TABLE public.grupos (
    clv_grupo character varying(10) NOT NULL,
    turno boolean
);
    DROP TABLE public.grupos;
       public         heap    postgres    false            �            1259    16679    login    TABLE     $  CREATE TABLE public.login (
    clv_usuario character varying(50) NOT NULL,
    pass_usuario character(41) NOT NULL,
    tipo_usuario character(4) DEFAULT 'PROF'::bpchar NOT NULL,
    CONSTRAINT login_tipo_usuario_check CHECK ((tipo_usuario = ANY (ARRAY['DIRE'::bpchar, 'PROF'::bpchar])))
);
    DROP TABLE public.login;
       public         heap    postgres    false            �            1259    16761    materia_usuario    TABLE     �   CREATE TABLE public.materia_usuario (
    clv_materia character varying(10) NOT NULL,
    clv_plan character varying(10) NOT NULL,
    clv_usuario character varying(50) NOT NULL,
    puntos_confianza smallint,
    puntos_director smallint
);
 #   DROP TABLE public.materia_usuario;
       public         heap    postgres    false            �            1259    16659    materias    TABLE     Z  CREATE TABLE public.materias (
    clv_materia character varying(10) NOT NULL,
    nombre_materia character varying(50) NOT NULL,
    creditos smallint,
    cuatrimestre smallint NOT NULL,
    posicion smallint NOT NULL,
    clv_plan character varying(10) NOT NULL,
    horas_x_semana smallint NOT NULL,
    tipo_materia character(3) NOT NULL
);
    DROP TABLE public.materias;
       public         heap    postgres    false            �            1259    16649    plan_estudios    TABLE     �   CREATE TABLE public.plan_estudios (
    clv_plan character varying(10) NOT NULL,
    nombre_plan character varying(45) NOT NULL,
    nivel character varying(3) NOT NULL,
    idcarrera smallint NOT NULL
);
 !   DROP TABLE public.plan_estudios;
       public         heap    postgres    false            �            1259    16781 	   prestamos    TABLE     s   CREATE TABLE public.prestamos (
    clv_usuario character varying(50) NOT NULL,
    idcarrera smallint NOT NULL
);
    DROP TABLE public.prestamos;
       public         heap    postgres    false            �            1259    16707    uso_aula_grupo    TABLE     �   CREATE TABLE public.uso_aula_grupo (
    dia smallint NOT NULL,
    espacio_tiempo smallint NOT NULL,
    id_aula character varying(10) NOT NULL,
    clv_grupo character varying(10) NOT NULL,
    clv_materia character varying(10) NOT NULL
);
 "   DROP TABLE public.uso_aula_grupo;
       public         heap    postgres    false            �            1259    16639    usuarios    TABLE     �   CREATE TABLE public.usuarios (
    clv_usuario character varying(50) NOT NULL,
    idcarrera smallint NOT NULL,
    nombre_usuario character varying(50),
    nivel_ads character varying(5) NOT NULL,
    contrato character varying(3) NOT NULL
);
    DROP TABLE public.usuarios;
       public         heap    postgres    false            t          0    16691    aula_equipo 
   TABLE DATA           C   COPY public.aula_equipo (id_equipo, id_aula, cantidad) FROM stdin;
    public          postgres    false    211   _       m          0    16629    aulas 
   TABLE DATA           Y   COPY public.aulas (id_aula, nombre, tipo, capacidad, descripcion, ubicacion) FROM stdin;
    public          postgres    false    204   0_       l          0    16624    carrera 
   TABLE DATA           <   COPY public.carrera (idcarrera, nombre_carrera) FROM stdin;
    public          postgres    false    203   M_       n          0    16634    categorias_equipo 
   TABLE DATA           N   COPY public.categorias_equipo (id_categoria, nombre, descripcion) FROM stdin;
    public          postgres    false    205   j_       v          0    16731    disponibilidad 
   TABLE DATA           J   COPY public.disponibilidad (dia, espacio_tiempo, clv_usuario) FROM stdin;
    public          postgres    false    213   �_       r          0    16669    equipo 
   TABLE DATA           N   COPY public.equipo (id_equipo, id_categoria, nombre, descripcion) FROM stdin;
    public          postgres    false    209   �_       w          0    16741    grupo_materia_profesor 
   TABLE DATA           U   COPY public.grupo_materia_profesor (clv_grupo, clv_materia, clv_usuario) FROM stdin;
    public          postgres    false    214   �_       k          0    16619    grupos 
   TABLE DATA           2   COPY public.grupos (clv_grupo, turno) FROM stdin;
    public          postgres    false    202   �_       s          0    16679    login 
   TABLE DATA           H   COPY public.login (clv_usuario, pass_usuario, tipo_usuario) FROM stdin;
    public          postgres    false    210   �_       x          0    16761    materia_usuario 
   TABLE DATA           p   COPY public.materia_usuario (clv_materia, clv_plan, clv_usuario, puntos_confianza, puntos_director) FROM stdin;
    public          postgres    false    215   `       q          0    16659    materias 
   TABLE DATA           �   COPY public.materias (clv_materia, nombre_materia, creditos, cuatrimestre, posicion, clv_plan, horas_x_semana, tipo_materia) FROM stdin;
    public          postgres    false    208   5`       p          0    16649    plan_estudios 
   TABLE DATA           P   COPY public.plan_estudios (clv_plan, nombre_plan, nivel, idcarrera) FROM stdin;
    public          postgres    false    207   R`       y          0    16781 	   prestamos 
   TABLE DATA           ;   COPY public.prestamos (clv_usuario, idcarrera) FROM stdin;
    public          postgres    false    216   o`       u          0    16707    uso_aula_grupo 
   TABLE DATA           ^   COPY public.uso_aula_grupo (dia, espacio_tiempo, id_aula, clv_grupo, clv_materia) FROM stdin;
    public          postgres    false    212   �`       o          0    16639    usuarios 
   TABLE DATA           _   COPY public.usuarios (clv_usuario, idcarrera, nombre_usuario, nivel_ads, contrato) FROM stdin;
    public          postgres    false    206   �`       �
           2606    16696    aula_equipo aula_equipo_pkey 
   CONSTRAINT     j   ALTER TABLE ONLY public.aula_equipo
    ADD CONSTRAINT aula_equipo_pkey PRIMARY KEY (id_equipo, id_aula);
 F   ALTER TABLE ONLY public.aula_equipo DROP CONSTRAINT aula_equipo_pkey;
       public            postgres    false    211    211            �
           2606    16633    aulas aulas_pkey 
   CONSTRAINT     S   ALTER TABLE ONLY public.aulas
    ADD CONSTRAINT aulas_pkey PRIMARY KEY (id_aula);
 :   ALTER TABLE ONLY public.aulas DROP CONSTRAINT aulas_pkey;
       public            postgres    false    204            �
           2606    16628    carrera carrera_pkey 
   CONSTRAINT     Y   ALTER TABLE ONLY public.carrera
    ADD CONSTRAINT carrera_pkey PRIMARY KEY (idcarrera);
 >   ALTER TABLE ONLY public.carrera DROP CONSTRAINT carrera_pkey;
       public            postgres    false    203            �
           2606    16638 (   categorias_equipo categorias_equipo_pkey 
   CONSTRAINT     p   ALTER TABLE ONLY public.categorias_equipo
    ADD CONSTRAINT categorias_equipo_pkey PRIMARY KEY (id_categoria);
 R   ALTER TABLE ONLY public.categorias_equipo DROP CONSTRAINT categorias_equipo_pkey;
       public            postgres    false    205            �
           2606    16735 "   disponibilidad disponibilidad_pkey 
   CONSTRAINT     ~   ALTER TABLE ONLY public.disponibilidad
    ADD CONSTRAINT disponibilidad_pkey PRIMARY KEY (dia, espacio_tiempo, clv_usuario);
 L   ALTER TABLE ONLY public.disponibilidad DROP CONSTRAINT disponibilidad_pkey;
       public            postgres    false    213    213    213            �
           2606    16673    equipo equipo_pkey 
   CONSTRAINT     W   ALTER TABLE ONLY public.equipo
    ADD CONSTRAINT equipo_pkey PRIMARY KEY (id_equipo);
 <   ALTER TABLE ONLY public.equipo DROP CONSTRAINT equipo_pkey;
       public            postgres    false    209            �
           2606    16745 2   grupo_materia_profesor grupo_materia_profesor_pkey 
   CONSTRAINT     �   ALTER TABLE ONLY public.grupo_materia_profesor
    ADD CONSTRAINT grupo_materia_profesor_pkey PRIMARY KEY (clv_grupo, clv_materia, clv_usuario);
 \   ALTER TABLE ONLY public.grupo_materia_profesor DROP CONSTRAINT grupo_materia_profesor_pkey;
       public            postgres    false    214    214    214            �
           2606    16623    grupos grupos_pkey 
   CONSTRAINT     W   ALTER TABLE ONLY public.grupos
    ADD CONSTRAINT grupos_pkey PRIMARY KEY (clv_grupo);
 <   ALTER TABLE ONLY public.grupos DROP CONSTRAINT grupos_pkey;
       public            postgres    false    202            �
           2606    16685    login login_pkey 
   CONSTRAINT     W   ALTER TABLE ONLY public.login
    ADD CONSTRAINT login_pkey PRIMARY KEY (clv_usuario);
 :   ALTER TABLE ONLY public.login DROP CONSTRAINT login_pkey;
       public            postgres    false    210            �
           2606    16765 $   materia_usuario materia_usuario_pkey 
   CONSTRAINT     �   ALTER TABLE ONLY public.materia_usuario
    ADD CONSTRAINT materia_usuario_pkey PRIMARY KEY (clv_materia, clv_plan, clv_usuario);
 N   ALTER TABLE ONLY public.materia_usuario DROP CONSTRAINT materia_usuario_pkey;
       public            postgres    false    215    215    215            �
           2606    16663    materias materias_pkey 
   CONSTRAINT     ]   ALTER TABLE ONLY public.materias
    ADD CONSTRAINT materias_pkey PRIMARY KEY (clv_materia);
 @   ALTER TABLE ONLY public.materias DROP CONSTRAINT materias_pkey;
       public            postgres    false    208            �
           2606    16653     plan_estudios plan_estudios_pkey 
   CONSTRAINT     d   ALTER TABLE ONLY public.plan_estudios
    ADD CONSTRAINT plan_estudios_pkey PRIMARY KEY (clv_plan);
 J   ALTER TABLE ONLY public.plan_estudios DROP CONSTRAINT plan_estudios_pkey;
       public            postgres    false    207            �
           2606    16785    prestamos prestamos_pkey 
   CONSTRAINT     j   ALTER TABLE ONLY public.prestamos
    ADD CONSTRAINT prestamos_pkey PRIMARY KEY (clv_usuario, idcarrera);
 B   ALTER TABLE ONLY public.prestamos DROP CONSTRAINT prestamos_pkey;
       public            postgres    false    216    216            �
           2606    16715 -   uso_aula_grupo unk_dia_espaciotiempo_clvgrupo 
   CONSTRAINT     �   ALTER TABLE ONLY public.uso_aula_grupo
    ADD CONSTRAINT unk_dia_espaciotiempo_clvgrupo UNIQUE (dia, espacio_tiempo, clv_grupo);
 W   ALTER TABLE ONLY public.uso_aula_grupo DROP CONSTRAINT unk_dia_espaciotiempo_clvgrupo;
       public            postgres    false    212    212    212            �
           2606    16713 +   uso_aula_grupo unk_dia_espaciotiempo_idaula 
   CONSTRAINT     ~   ALTER TABLE ONLY public.uso_aula_grupo
    ADD CONSTRAINT unk_dia_espaciotiempo_idaula UNIQUE (dia, espacio_tiempo, id_aula);
 U   ALTER TABLE ONLY public.uso_aula_grupo DROP CONSTRAINT unk_dia_espaciotiempo_idaula;
       public            postgres    false    212    212    212            �
           2606    16711 "   uso_aula_grupo uso_aula_grupo_pkey 
   CONSTRAINT     �   ALTER TABLE ONLY public.uso_aula_grupo
    ADD CONSTRAINT uso_aula_grupo_pkey PRIMARY KEY (dia, espacio_tiempo, id_aula, clv_grupo, clv_materia);
 L   ALTER TABLE ONLY public.uso_aula_grupo DROP CONSTRAINT uso_aula_grupo_pkey;
       public            postgres    false    212    212    212    212    212            �
           2606    16643    usuarios usuarios_pkey 
   CONSTRAINT     ]   ALTER TABLE ONLY public.usuarios
    ADD CONSTRAINT usuarios_pkey PRIMARY KEY (clv_usuario);
 @   ALTER TABLE ONLY public.usuarios DROP CONSTRAINT usuarios_pkey;
       public            postgres    false    206            �
           2606    16697 &   aula_equipo fk_aulaequipo_aula_id_aula    FK CONSTRAINT     �   ALTER TABLE ONLY public.aula_equipo
    ADD CONSTRAINT fk_aulaequipo_aula_id_aula FOREIGN KEY (id_aula) REFERENCES public.aulas(id_aula);
 P   ALTER TABLE ONLY public.aula_equipo DROP CONSTRAINT fk_aulaequipo_aula_id_aula;
       public          postgres    false    211    204    2749            �
           2606    16702 *   aula_equipo fk_aulaequipo_equipo_id_equipo    FK CONSTRAINT     �   ALTER TABLE ONLY public.aula_equipo
    ADD CONSTRAINT fk_aulaequipo_equipo_id_equipo FOREIGN KEY (id_equipo) REFERENCES public.equipo(id_equipo);
 T   ALTER TABLE ONLY public.aula_equipo DROP CONSTRAINT fk_aulaequipo_equipo_id_equipo;
       public          postgres    false    209    2759    211            �
           2606    16736 5   disponibilidad fk_disponibilidad_usuarios_clv_usuario    FK CONSTRAINT     �   ALTER TABLE ONLY public.disponibilidad
    ADD CONSTRAINT fk_disponibilidad_usuarios_clv_usuario FOREIGN KEY (clv_usuario) REFERENCES public.usuarios(clv_usuario);
 _   ALTER TABLE ONLY public.disponibilidad DROP CONSTRAINT fk_disponibilidad_usuarios_clv_usuario;
       public          postgres    false    213    2753    206            �
           2606    16674 -   equipo fk_equipo_categoriaequipo_id_categoria    FK CONSTRAINT     �   ALTER TABLE ONLY public.equipo
    ADD CONSTRAINT fk_equipo_categoriaequipo_id_categoria FOREIGN KEY (id_categoria) REFERENCES public.categorias_equipo(id_categoria);
 W   ALTER TABLE ONLY public.equipo DROP CONSTRAINT fk_equipo_categoriaequipo_id_categoria;
       public          postgres    false    205    2751    209            �
           2606    16746 ?   grupo_materia_profesor fk_grupomateriaprofesor_grupos_clv_grupo    FK CONSTRAINT     �   ALTER TABLE ONLY public.grupo_materia_profesor
    ADD CONSTRAINT fk_grupomateriaprofesor_grupos_clv_grupo FOREIGN KEY (clv_grupo) REFERENCES public.grupos(clv_grupo);
 i   ALTER TABLE ONLY public.grupo_materia_profesor DROP CONSTRAINT fk_grupomateriaprofesor_grupos_clv_grupo;
       public          postgres    false    214    202    2745            �
           2606    16751 C   grupo_materia_profesor fk_grupomateriaprofesor_materias_clv_materia    FK CONSTRAINT     �   ALTER TABLE ONLY public.grupo_materia_profesor
    ADD CONSTRAINT fk_grupomateriaprofesor_materias_clv_materia FOREIGN KEY (clv_materia) REFERENCES public.materias(clv_materia);
 m   ALTER TABLE ONLY public.grupo_materia_profesor DROP CONSTRAINT fk_grupomateriaprofesor_materias_clv_materia;
       public          postgres    false    214    208    2757            �
           2606    16756 C   grupo_materia_profesor fk_grupomateriaprofesor_usuarios_clv_usuario    FK CONSTRAINT     �   ALTER TABLE ONLY public.grupo_materia_profesor
    ADD CONSTRAINT fk_grupomateriaprofesor_usuarios_clv_usuario FOREIGN KEY (clv_usuario) REFERENCES public.usuarios(clv_usuario);
 m   ALTER TABLE ONLY public.grupo_materia_profesor DROP CONSTRAINT fk_grupomateriaprofesor_usuarios_clv_usuario;
       public          postgres    false    214    2753    206            �
           2606    16686 #   login fk_login_usuarios_clv_usuario    FK CONSTRAINT     �   ALTER TABLE ONLY public.login
    ADD CONSTRAINT fk_login_usuarios_clv_usuario FOREIGN KEY (clv_usuario) REFERENCES public.usuarios(clv_usuario);
 M   ALTER TABLE ONLY public.login DROP CONSTRAINT fk_login_usuarios_clv_usuario;
       public          postgres    false    206    210    2753            �
           2606    16664 *   materias fk_materias_planestudios_clv_plan    FK CONSTRAINT     �   ALTER TABLE ONLY public.materias
    ADD CONSTRAINT fk_materias_planestudios_clv_plan FOREIGN KEY (clv_plan) REFERENCES public.plan_estudios(clv_plan);
 T   ALTER TABLE ONLY public.materias DROP CONSTRAINT fk_materias_planestudios_clv_plan;
       public          postgres    false    2755    208    207            �
           2606    16766 6   materia_usuario fk_materiausuario_materias_clv_materia    FK CONSTRAINT     �   ALTER TABLE ONLY public.materia_usuario
    ADD CONSTRAINT fk_materiausuario_materias_clv_materia FOREIGN KEY (clv_materia) REFERENCES public.materias(clv_materia);
 `   ALTER TABLE ONLY public.materia_usuario DROP CONSTRAINT fk_materiausuario_materias_clv_materia;
       public          postgres    false    2757    215    208            �
           2606    16776 7   materia_usuario fk_materiausuario_planestudios_clv_plan    FK CONSTRAINT     �   ALTER TABLE ONLY public.materia_usuario
    ADD CONSTRAINT fk_materiausuario_planestudios_clv_plan FOREIGN KEY (clv_plan) REFERENCES public.plan_estudios(clv_plan);
 a   ALTER TABLE ONLY public.materia_usuario DROP CONSTRAINT fk_materiausuario_planestudios_clv_plan;
       public          postgres    false    215    2755    207            �
           2606    16771 6   materia_usuario fk_materiausuario_usuarios_clv_usuario    FK CONSTRAINT     �   ALTER TABLE ONLY public.materia_usuario
    ADD CONSTRAINT fk_materiausuario_usuarios_clv_usuario FOREIGN KEY (clv_usuario) REFERENCES public.usuarios(clv_usuario);
 `   ALTER TABLE ONLY public.materia_usuario DROP CONSTRAINT fk_materiausuario_usuarios_clv_usuario;
       public          postgres    false    206    215    2753            �
           2606    16654 /   plan_estudios fk_planestudios_carrera_idcarrera    FK CONSTRAINT     �   ALTER TABLE ONLY public.plan_estudios
    ADD CONSTRAINT fk_planestudios_carrera_idcarrera FOREIGN KEY (idcarrera) REFERENCES public.carrera(idcarrera);
 Y   ALTER TABLE ONLY public.plan_estudios DROP CONSTRAINT fk_planestudios_carrera_idcarrera;
       public          postgres    false    207    2747    203            �
           2606    16791 (   prestamos fk_prestamos_carrera_idcarrera    FK CONSTRAINT     �   ALTER TABLE ONLY public.prestamos
    ADD CONSTRAINT fk_prestamos_carrera_idcarrera FOREIGN KEY (idcarrera) REFERENCES public.carrera(idcarrera);
 R   ALTER TABLE ONLY public.prestamos DROP CONSTRAINT fk_prestamos_carrera_idcarrera;
       public          postgres    false    2747    203    216            �
           2606    16786 +   prestamos fk_prestamos_usuarios_clv_usuario    FK CONSTRAINT     �   ALTER TABLE ONLY public.prestamos
    ADD CONSTRAINT fk_prestamos_usuarios_clv_usuario FOREIGN KEY (clv_usuario) REFERENCES public.usuarios(clv_usuario);
 U   ALTER TABLE ONLY public.prestamos DROP CONSTRAINT fk_prestamos_usuarios_clv_usuario;
       public          postgres    false    2753    216    206            �
           2606    16726 ,   uso_aula_grupo fk_usoaulagrupo_aulas_id_aula    FK CONSTRAINT     �   ALTER TABLE ONLY public.uso_aula_grupo
    ADD CONSTRAINT fk_usoaulagrupo_aulas_id_aula FOREIGN KEY (id_aula) REFERENCES public.aulas(id_aula);
 V   ALTER TABLE ONLY public.uso_aula_grupo DROP CONSTRAINT fk_usoaulagrupo_aulas_id_aula;
       public          postgres    false    204    212    2749            �
           2606    16716 /   uso_aula_grupo fk_usoaulagrupo_grupos_clv_grupo    FK CONSTRAINT     �   ALTER TABLE ONLY public.uso_aula_grupo
    ADD CONSTRAINT fk_usoaulagrupo_grupos_clv_grupo FOREIGN KEY (clv_grupo) REFERENCES public.grupos(clv_grupo);
 Y   ALTER TABLE ONLY public.uso_aula_grupo DROP CONSTRAINT fk_usoaulagrupo_grupos_clv_grupo;
       public          postgres    false    202    2745    212            �
           2606    16721 3   uso_aula_grupo fk_usoaulagrupo_materias_clv_materia    FK CONSTRAINT     �   ALTER TABLE ONLY public.uso_aula_grupo
    ADD CONSTRAINT fk_usoaulagrupo_materias_clv_materia FOREIGN KEY (clv_materia) REFERENCES public.materias(clv_materia);
 ]   ALTER TABLE ONLY public.uso_aula_grupo DROP CONSTRAINT fk_usoaulagrupo_materias_clv_materia;
       public          postgres    false    2757    208    212            �
           2606    16644 &   usuarios fk_usuarios_carrera_idcarrera    FK CONSTRAINT     �   ALTER TABLE ONLY public.usuarios
    ADD CONSTRAINT fk_usuarios_carrera_idcarrera FOREIGN KEY (idcarrera) REFERENCES public.carrera(idcarrera) ON UPDATE CASCADE;
 P   ALTER TABLE ONLY public.usuarios DROP CONSTRAINT fk_usuarios_carrera_idcarrera;
       public          postgres    false    2747    203    206            t      x������ � �      m      x������ � �      l      x������ � �      n      x������ � �      v      x������ � �      r      x������ � �      w      x������ � �      k      x������ � �      s      x������ � �      x      x������ � �      q      x������ � �      p      x������ � �      y      x������ � �      u      x������ � �      o      x������ � �     